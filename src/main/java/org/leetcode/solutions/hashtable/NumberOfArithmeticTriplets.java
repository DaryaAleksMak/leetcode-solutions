package org.leetcode.solutions.hashtable;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {

  //@formatter:off
  /**
   * input array: 0,1,4,6,7,10
   * diff = 3
   * [1,4,7]
   * [4,7,10]
   *
   * 0 + 3 = 3    {0,3}
   * 1 + 3 = 4    {1,4}
   * 4 + 3 = 7    {4,7}
   * 6 + 3 = 9    {6,9}
   * 7 + 3 = 10   {7,10}
   * 10 + 3 = 13  {10,13}
   *
   * for(entrySet : map) {
   *
   * }
   *
   * first_point = 0 (map_key)
   * second_point = 3 (map_value)
   *
   * if (map.get(second_point) != null ){
   *
   * }
   *
   *
   *
   */
  //@formatter:on
  public int arithmeticTriplets(int[] nums, int diff) {
    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
      set.add(num);
    }

    int result = 0;
    for (Integer key : set) {
      if (set.contains(key + diff) && set.contains(key + diff * 2)) {
        result++;
      }

    }
    return result;
  }
}
