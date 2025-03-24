package org.leetcode.solutions.heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FindXSumOfAllKLongSubarraysI {

  //@formatter:off
  /**
   * Input: nums = [1,1,2,2,3,4,2,3], k = 6, x = 2 left = 0;
   * right = left + k - 1
   * sub_array = [1,1,2,2,3,4]
   * map -> {
   *         1 -> 2
   *         2 -> 2
   *         3 -> 1
   *         4 -> 1
   * }
   *
   * queue = {
   *  [1, 2]
   *  [2, 2]
   *  [4, 1]
   *  [3, 1]
   * }
   *
   */
  //@formatter:on
  public int[] findXSum(int[] nums, int k, int x) {
    var result = new int[nums.length - k + 1];

    for (int i = 0; i < nums.length - k + 1; i++) {
      int left = i;
      int right = i + k;
      var map = getMap(nums, left, right);

      int sum = 0;
      if (x > map.size()) {
        for (int j = left; j <= right; j++) {
          sum += nums[j];
        }
      } else {
        var priorityQueue = getQueue(map);
        int counter = x;

        while (counter > 0) {
          var mostFrequentElementInfo = priorityQueue.poll();
          int value = mostFrequentElementInfo[0];
          int frequency = mostFrequentElementInfo[1];

          while (frequency > 0) {
            sum += value;
            frequency--;
          }
          counter--;
        }
      }

      result[i] = sum;
    }

    return result;
  }

  private PriorityQueue<int[]> getQueue(HashMap<Integer, Integer> map) {
    PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((arr1, arr2) -> {
      var frequencyCompare = Integer.compare(arr2[1], arr1[1]);
      if (frequencyCompare == 0) {
        return Integer.compare(arr2[0], arr1[0]);
      } else {
        return frequencyCompare;
      }
    }
    );

    for (Integer key : map.keySet()) {
      priorityQueue.add(new int[]{key, map.get(key)});
    }
    return priorityQueue;
  }

  private HashMap<Integer, Integer> getMap(int[] nums, int left, int right) {
    var map = new HashMap<Integer, Integer>();

    for (int i = left; i < right; i++) {
      var count = map.getOrDefault(nums[i], 0);
      map.put(nums[i], ++count);
    }

    return map;
  }

}
