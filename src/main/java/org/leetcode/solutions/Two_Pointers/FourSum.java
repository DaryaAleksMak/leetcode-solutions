package org.leetcode.solutions.Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a],
 * nums[b], nums[c], nums[d]] such that:
 * <p>
 * 1. 0 <= a, b, c, d < n 2. a, b, c, d are distinct. 3. nums[a] + nums[b] + nums[c] + nums[d] ==
 * target
 * <p>
 * You may return the answer in any order.
 */

//@formatter:off
/**
 * input array: 1, 0, -1, 0, -2, 2
 * <p>
 * sorted array:
 * <p>
 * value ->   |-2 |-1 | 0 | 0 | 1 | 2 |
 * indexes -> | 0 | 1 | 2 | 3 | 4 | 5 |
 *
 * length = 6 pointers-> firstPointer <=  length - 4 pointers-> secondPointer <=  length - 3
 *
 *   |first|second| left|right|
 *   | -2  |  -1  |  0  |  2  | -1<0  first=0 second=1 left=2 right=5 left ++ left ++
 *   | -2  |  -1  |  1  |  2  | 0==0  first=0 second=1 left=4 right=5 left ++  left <> right == false second ++
 *
 *   | -2  |  0   |  0  |  2  | 0==0  first=0 second=2 left=3 right=5 left ++
 *   | -2  |  0   |  1  |  2  | 1>0   first=0 second=2 left=4 right=5 right-- left <> right == false second ++ second++ second > nums.length - 3
 *
 *
 *   | -1  |  0   |  0  |  2  | 1>0   first=1 second=2 left=3 right=5 right--
 *   | -1  |  0   |  0  |  1  | 0==0   first=1 second=2 left=3 right=4 left++  left <> right == false second ++ second++ second > nums.length - 3
 *
 *
 *  | 0  |  0   |  1  |  2  | 3>0    left <> right == false second ++ second++ second > nums.length - 3
 *
 *
 */
//@formatter:on
public class FourSum {

  public List<List<Integer>> fourSum(int[] nums, int target) {

    Arrays.sort(nums);

    List<List<Integer>> result = new ArrayList<>();

    int leftPointer;
    int rightPointer;

    for (int i = 0; i <= nums.length - 4; i++) {

      for (int j = i + 1; j <= nums.length - 3; j++) {
        leftPointer = j + 1;
        rightPointer = nums.length - 1;

        while (leftPointer < rightPointer) {
          long sum = (long)nums[i] + (long) nums[j] + (long)nums[leftPointer]
              + (long)nums[rightPointer];
          if (sum == target) {
            result.add(List.of(
                nums[i], nums[j], nums[leftPointer],
                nums[rightPointer]));

            while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer + 1]) {
              leftPointer++;
            }

            while (leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer - 1]) {
              rightPointer--;
            }

            leftPointer++;
            rightPointer--;


          } else if (sum < target) {
            leftPointer++;
          } else {
            rightPointer--;
          }
        }
        while (j <= nums.length - 3 && nums[j] == nums[j + 1]) {
          j++;
        }

      }
      while (i <= nums.length - 4 && nums[i] == nums[i + 1]) {
        i++;
      }
    }

    return result;
  }

}
