package org.leetcode.solutions.hashtable;

//@formatter:off

/**
 * nums1 = 1,2,4,12
 * nums2 = 2,4
 * k = 3
 *
 * 1. take a number from nums1: 1 and 1*3
 */
//@formatter:on

public class FindTheNumberOfGoodPairsI {

  public int numberOfPairs(int[] nums1, int[] nums2, int k) {
    int result = 0;
    for (int num1 : nums1) {
      for (int num2 : nums2) {
        if (num1 % (num2 * k) == 0) {
          result++;
        }
      }
    }
    return result;
  }

}
