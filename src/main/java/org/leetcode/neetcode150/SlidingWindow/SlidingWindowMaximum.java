package org.leetcode.neetcode150.SlidingWindow;

import java.util.ArrayDeque;

public class SlidingWindowMaximum {

  public int[] maxSlidingWindow(int[] nums, int k) {
    if (nums.length == 0) {
      return new int[0];
    }

    var queue = new ArrayDeque<Integer>();
    var result = new int[nums.length - k + 1];

    int start = 0;

    // init first window
    for (int i = 0; i < k; i++) {
      queue.add(nums[i]);
    }
    var currentWindow = 0;
    result[currentWindow] = queue.peek();
    start = 1;

    for (int end = k; end < nums.length; end++) {
      //if removed from window is previous max
      queue.remove(nums[start - 1]);
      queue.add(nums[end]);
      result[++currentWindow] = queue.peek();
      start++;
    }
    return result;
  }
}
