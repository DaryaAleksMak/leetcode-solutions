package org.leetcode.solutions.hashtable;

import java.util.HashMap;

public class TwoSneakyNumbersOfDigitville {

  public int[] getSneakyNumbers(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] result = new int[2];
    int counter = 0;
    for (Integer num : nums) {
      Integer i = map.get(num);
      if (i == null) {
        map.put(num, 0);
      } else {
        result[counter++] = num;
        if (counter == 2) {
          break;
        }
      }
    }
    return result;
  }
}
