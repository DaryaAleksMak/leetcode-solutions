package org.leetcode.solutions.sorting;

public class MaximumProductOfTwoElementsInArray_1464 {

  /**
   * 1,5,4,5
   *
   * 1. f_m = 1 && s_m = 0
   * 1. f_m = 5 && s_m = 1
   * 1. f_m = 5 && s_m = 1
   */
  public int maxProduct(int[] nums) {
    int firstMax = 0;
    int secondMax = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= firstMax) {
        secondMax = firstMax;
        firstMax = nums[i];
        continue;
      }

      if (nums[i] >= secondMax) {
        secondMax = nums[i];
      }
    }

    return (firstMax - 1) * (secondMax - 1);
  }
}
