package org.leetcode.neetcode150.stack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.TreeMap;

public class DailyTemperatures {

  /**
   * 30, 38, 30, 36, 35, 40, 28
   */

  public int[] dailyTemperatures(int[] temperatures) {
    var stack = new Stack<int[]>();
    var result = new int[temperatures.length];
    for (int i = temperatures.length - 1; i >= 0; i--) {
      var dailyTemp = temperatures[i];

      while (!stack.isEmpty() && dailyTemp >= stack.peek()[0]) {
        stack.pop();
      }
      new TreeMap<Integer, Integer>(Comparator.reverseOrder());

      result[i] = stack.isEmpty() ? 0 : stack.peek()[1] - i;
      var array = new int[]{dailyTemp,i};
      stack.push(array);
    }

    return result;
  }
}
