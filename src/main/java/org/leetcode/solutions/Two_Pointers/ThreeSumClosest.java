package org.leetcode.solutions.Two_Pointers;

import java.util.Arrays;

public class ThreeSumClosest {

  public int threeSumClosest(int[] nums, int target) {

    Arrays.sort(nums);
    int closestSum = Integer.MAX_VALUE;

    //  [0,1,1,1]
    for (int i = 0; i < nums.length; i++) {
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];

        if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
          closestSum = sum;
        }

        if (sum == target) {
          return sum;
        }

        if (sum < target) {
          left++;
        } else {
          right--;
        }

      }

    }

    return closestSum;
  }

}
