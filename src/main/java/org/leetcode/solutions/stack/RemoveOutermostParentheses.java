package org.leetcode.solutions.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveOutermostParentheses {

  //@formatter:off
  /**
   * input string: '(','(',')','(',')',')','(','(',')',')' output string: ()()()
   * input indexes: 0   1   2   3   4   5   6   7   8   9
   *
   *
   */
  //@formatter:on


  public String removeOuterParentheses(String s) {
    StringBuilder sb = new StringBuilder();
    int count = 0;
    for(char c : s.toCharArray()){
      if(c == '(' && count++ > 0) sb.append(c);
      if(c == ')' && count-- > 1) sb.append(c);
    }
    return sb.toString();

  }

  public String removeOuterParenthesesBrute(String s) {
    Stack<Character> stack = new Stack<>();
    List<Integer> list = new ArrayList<>();

    char open = '(';
    char close = ')';
    char[] charArray = s.toCharArray();

    for (int i = 0; i < charArray.length; i++) {
      if (stack.isEmpty()) {
        stack.push(charArray[i]);
        list.add(i);
        continue;
      }
      if (charArray[i] == open && stack.peek() == close) {
        stack.pop();
        if (stack.isEmpty()) {
          list.add(i);
        }
        continue;
      }

      if (charArray[i] == close && stack.peek() == open) {
        stack.pop();
        if (stack.isEmpty()) {
          list.add(i);
        }
        continue;
      } else {
        stack.push(charArray[i]);
      }
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < list.size() -1; i++) {
      builder.append(s, list.get(i) + 1, list.get(i + 1));
    }
    return builder.toString();

  }

}
