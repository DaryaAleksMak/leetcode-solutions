package org.leetcode.neetcode150.stack;

import java.util.Stack;

public class LargestRectangleInHistogram {

  public int largestRectangleArea(int[] heights) {
    if (heights.length == 1) return heights[0];
    var stack = new Stack<Integer>();

    for (int i = heights.length - 2; i >=0; i--){
      var current = heights[i];
      var prev = heights[i + 1];
      var minHeight = Math.min(current, prev);
      var triangle = Math.max(minHeight * 2, Math.max(current, prev));

      if (stack.isEmpty()){
        stack.push(triangle);
        continue;
      }

      if (triangle <= stack.peek()) continue;

      while (!stack.isEmpty() && triangle > stack.peek()) {
        stack.pop();
      }
      stack.push(triangle);
    }

    return stack.peek();
  }
}
