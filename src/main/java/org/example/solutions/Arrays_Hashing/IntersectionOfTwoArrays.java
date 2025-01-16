package org.example.solutions.Arrays_Hashing;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


/**
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 */
public class IntersectionOfTwoArrays {

  /**
   * nums1 = [1,2,2,1], nums2 = [2,2] -> Output: [2] nums1 = [4,9,5], nums2 = [9,4,9,8,4] -> Output:
   * [9,4]
   */

  // brute force solution
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new TreeSet<>();
    Set<Integer> intersect = new HashSet<>();
    for (int k : nums1) {
      set.add(k);
    }

    for (int j : nums2) {
      if (set.contains(j)) {
        intersect.add(j);
      }
    }

    return intersect.stream().mapToInt(Integer::intValue).toArray();
  }
}
