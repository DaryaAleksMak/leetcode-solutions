package org.leetcode.solutions.heap;

import java.util.PriorityQueue;


public class FinalArrayStateAfterKMultiplicationOperationsI {

  public int[] getFinalState(int[] nums, int k, int multiplier) {

    var queue = new PriorityQueue<Integer[]>();

    for (int i = 0; i < nums.length; i++) {
      queue.add(new Integer[]{nums[i], i});
    }

    while (k > 0) {
      var min = queue.poll();
      queue.add(new Integer[]{min[0] * multiplier, min[1]});
      k--;
    }

    for (Integer[] num : queue) {
      var value = num[0];
      var index = num[1];
      nums[index] = value;
    }

    return nums;
  }


}
