package org.leetcode.solutions.matrix;

import java.util.PriorityQueue;

public class TheKWeakestRowsInMatrix {
//@formatter:off
  /**
   * A row i is weaker than a row j if one of the following is true:
   * <p>
   * The number of soldiers in row i is less than the number of soldiers in row j. Both rows have
   * the same number of soldiers and i < j.
   */

  /**
   *
   * Input: mat =
   * [[1,1,0,0,0],
   *  [1,1,1,1,0],
   *  [1,0,0,0,0],
   *  [1,1,0,0,0],
   *  [1,1,1,1,1]],
   *
   - Row 0: 2
   - Row 1: 4
   - Row 2: 1
   - Row 3: 2
   - Row 4: 5

   [2,0,3]


   0: queue is empty -> true   put sum in queue ->  queue: 2
   1: 4 < queue.peek [2] -> false put element in queue -> queue: 2, 4
   2: 1 < queue.peek[4] -> true while 1 < queue.peek move element to top of queue
   */

//@formatter:on

  public int[] kWeakestRows(int[][] mat, int k) {
    int m = mat.length;

    PriorityQueue<int[]> soldierCount = new PriorityQueue<>((a, b) ->
        a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

    for (int i = 0; i < m; i++) {
      soldierCount.add(new int[]{countSoldiers(mat[i]), i});
    }

    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = soldierCount.poll()[1];
    }

    return result;
  }

  private int countSoldiers(int[] row) {
    int count = 0;
    for (int num : row) {
      if (num == 1) count++;
      else break;
    }
    return count;
  }


}
