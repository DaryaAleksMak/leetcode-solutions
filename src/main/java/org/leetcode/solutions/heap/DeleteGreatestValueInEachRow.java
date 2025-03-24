package org.leetcode.solutions.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class DeleteGreatestValueInEachRow {

  public int deleteGreatestValue(int[][] grid) {

    var list = new ArrayList<PriorityQueue<Integer>>();

    for (int i = 0; i < grid.length; i++) {
      PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
      for (int j = 0; j < grid[0].length; j++) {
        queue.offer(grid[i][j]);
      }
      list.add(queue);

    }

    var resultSum = 0;

    while (!list.get(0).isEmpty()) {
      int currentMax = 0;
      var queueIteration = 0;
      while (queueIteration < list.size()) {
        var maxInQueue = list.get(queueIteration).poll();
        currentMax = Math.max(currentMax, maxInQueue);
        queueIteration++;
      }
      resultSum += currentMax;
    }

    return resultSum;
  }
}
