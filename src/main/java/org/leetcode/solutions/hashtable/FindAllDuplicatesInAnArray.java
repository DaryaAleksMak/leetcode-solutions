package org.leetcode.solutions.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicatesInAnArray {

  public List<Integer> findDuplicates(int[] nums) {
    ArrayList<Integer> result = new ArrayList<>();

    if (nums.length <2){
      return result;
    }
    var map = new HashMap<Integer, Integer>();

    for (int num : nums) {
      Integer i = map.get(num);
      if (i != null) {
        result.add(num);
      } else {
        map.put(num, 0);
      }
    }
    return result;
  }
}
