package org.example.solutions.Arrays_Hashing;

/**
 * https://leetcode.com/problems/missing-number/description/
 */
public class MissingNumber {

  /**
   * Given an array nums containing n distinct numbers in the range [0, n], return the only number
   * in the range that is missing from the array. [3,0,1] -> 2
   * <p>
   * [0,1] -> 2
   * <p>
   * [9,6,4,2,3,5,7,0,1] -> 8 [0,1,2,3,4,5,6,7,9] length = 9
   */


  public int missingNumber(int[] nums) {
    var sum = 0;
    var numsSum = 0;
    for (int i = 0; i <= nums.length; i++) {
      sum += i;
      if (i < nums.length) {
        numsSum += nums[i];
      }
    }
    return sum - numsSum;
  }

  //brute force
//  public int missingNumber(int[] nums) {
//    List<Integer> reference = IntStream.range(0, nums.length + 1).boxed()
//        .collect(Collectors.toList());
//
//    for (int i = 0; i < nums.length; i++) {
//      reference.remove((Integer) nums[i]);
//    }
//
//    return reference.isEmpty() ? nums.length : reference.getFirst();
//  }

  //brute force
//  public int missingNumber(int[] nums) {
//    int[] sortedArray = Arrays.stream(nums).sorted().toArray();
//
//    for (int i = 0; i < sortedArray.length; i++) {
//      if (sortedArray[i] != i) {
//        return i;
//      }
//    }
//    return nums.length;
//  }


}
