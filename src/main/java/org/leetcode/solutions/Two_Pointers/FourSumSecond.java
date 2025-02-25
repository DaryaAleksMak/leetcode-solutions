package org.leetcode.solutions.Two_Pointers;

//@formatter:off
import java.util.HashMap; /**
 *  nums1 = [1,2],
 *  nums2 = [-2,-1],
 *  nums3 = [-1,2],
 *  nums4 = [0,2]
 *
 *  map1 = {
 *    1-2(-1)           -> 1
 *    1-1(0) && 2-2(0)  -> 2
 *    2-1(1)            -> 1
 *
 * nums1 = [-1,-1]
 * nums2 = [-1,1]
 * nums3 = [-1,1]
 * nums4 = [1,-1]
 *
 * map12 = {
 *     -1-1(-2) -> 2
 *     -1+1(0)  -> 2
 *  }
 *
 *   map34 = {
 *      -1+1(0) -> 2
 *      -1-1(-2)  -> 1
 *       1+1(2)  -> 1
 *  }
 *
 *
 */
//@formatter:on

public class FourSumSecond {

  public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    int result = 0;

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num1 : nums1) {
      for (int num2 : nums2) {
        int sum = num1 + num2;
        map.put(sum, map.getOrDefault(sum, 0)+1);
      }
    }

    for (int num3 : nums3) {
      for (int num4 : nums4) {
        int sum = -(num3 + num4);
        result+= map.getOrDefault(sum, 0);;
        }
    }

    return result;
  }
}
