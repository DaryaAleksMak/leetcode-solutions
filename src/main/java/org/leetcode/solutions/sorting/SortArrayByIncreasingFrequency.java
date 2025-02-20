package org.leetcode.solutions.sorting;

//@formatter:off
import java.util.HashMap;
import java.util.Objects;
import java.util.PriorityQueue; /**
 * input:
 * -1,1,-6,4,5,-6,1,4,1
 *
 * arrays sort: -6,-6,-1,1,1,1,4,4,5
 *
 * value : count
 *   -1  : 1
 *    1  : 3
 *   -6  : 2
 *    4  : 2
 *    5  : 1
 *
 * output:
 * 1.  queue: [-1,1]
 * 2.  queue: [-1,1], [1,3]
 * 3.  queue: [-1,1], [-6,2], [1,3]
 * 4.  queue: [-1,1], [-6,2], [1,3]
 *
 *
 */
//@formatter:on

public class SortArrayByIncreasingFrequency {

  //-1,1,-6,4,5,-6,1,4,1
  public int[] frequencySort(int[] nums) {
    HashMap<Integer, Integer> numsFrequencyMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      numsFrequencyMap.put(nums[i], numsFrequencyMap.getOrDefault(nums[i], 0) + 1);
    }

    PriorityQueue<Integer[]> priorityQueue = new PriorityQueue<>(
        (a, b) -> {
          if (Objects.equals(a[1], b[1])) {
            return Integer.compare(b[0], a[0]); // Sort `a[0]` in descending order
          }
          return Integer.compare(a[1], b[1]); // Sort `a[1]` in ascending order
        });

    for (Integer num : numsFrequencyMap.keySet()) {
      Integer freq = numsFrequencyMap.get(num);
      Integer[] item = {num, freq};
      priorityQueue.add(item);
    }

    int[] result = new int[nums.length];
    int index = 0;
    while (!priorityQueue.isEmpty()) {
      Integer[] poll = priorityQueue.poll();
      for (int i = 0; i < poll[1]; i++) {
        result[index++] = poll[0];
      }
    }

    return result;
  }
}
