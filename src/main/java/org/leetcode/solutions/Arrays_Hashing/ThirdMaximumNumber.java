package org.leetcode.solutions.Arrays_Hashing;

import java.util.Arrays;

/**
 * Given an integer array nums, return the third distinct maximum number in this array. If the third
 * maximum does not exist, return the maximum number.
 * <p>
 * Input: nums = [3,2,1] Output: 1 Input: nums = [1,2] Output: 2 Input: nums = [2,2,3,1] Output: 1
 * [2,3,1]
 */
public class ThirdMaximumNumber {

  public int thirdMax(int[] nums) {
    Arrays.sort(nums);

    int max = nums[nums.length - 1];
    int count = 1;
    for (int i = nums.length - 2; i >= 0; i--) {
      if (nums[i] != max) {
        max = nums[i];
        count++;
      }
      if (count == 3) {
        break;
      }
    }
    if (count < 3) {
      return nums[nums.length - 1];
    }
    return max;
  }

}
