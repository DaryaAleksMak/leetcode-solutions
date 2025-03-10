package org.leetcode.solutions.Arrays_Hashing;

public class ProductsOfArrayExceptSelf2 {

  //@formatter:off
  /**
   * input array:  1, 2, 3, 4
   * result array: 24,24,8,6
   *
   * prefixArray = [1, 2, 6, 24]  prefixArray[i] = inputArray[i] * prefixArray[i-i]
   * postfixArray= [24,24,12,4]   postfixArray[i] = inputArray[i] * prefixArray[i+i]
   *
   * result[i] = prefixArray[i-1]*postfixArray[i+1]
   */
  //@formatter:on

  public int[] productExceptSelf(int[] nums) {
    var prefixProduct = new int[nums.length];
    var postfixProduct = new int[nums.length];

    prefixProduct[0] = nums[0];
    postfixProduct[nums.length - 1] = nums[nums.length - 1];

    for (int i = 1; i < nums.length; i++) {
      prefixProduct[i] = nums[i] * prefixProduct[i - 1];
    }
    for (int i = nums.length - 2; i >= 0; i--) {
      postfixProduct[i] = nums[i] * postfixProduct[i + 1];
    }

    nums[0] = postfixProduct[1];
    nums[nums.length - 1] = prefixProduct[nums.length - 2];
    for (int i = 1; i < nums.length - 1; i++) {
      nums[i] = prefixProduct[i - 1] * postfixProduct[i + 1];
    }

    return nums;
  }
}
