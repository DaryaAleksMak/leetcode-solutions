package org.leetcode.solutions.sorting;

import java.util.Collections;
import java.util.TreeMap;

public class SortThePeople {

  public String[] sortPeople(String[] names, int[] heights) {
    var heightToNameMap = new TreeMap<Integer, String>(Collections.reverseOrder());

    for (int i = 0; i < names.length; i++) {
      heightToNameMap.put(heights[i], names[i]);
    }

    var result = new String[names.length];

    int i = 0;
    for (String name : heightToNameMap.values()) {
      result[i++] = name;
    }

    return result;
  }

}
