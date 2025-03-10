package org.leetcode.solutions.stack;

import java.util.Stack;

public class ClearDigits {

  public String clearDigits(String s) {
    Stack<Character> characters = new Stack<>();
    //cb34
    char[] charArray = s.toCharArray();
    for (Character character : charArray) {
      if (Character.isDigit(character)) {
        if (characters.peek() != null && Character.isAlphabetic(characters.peek())) {
          characters.pop();
        } else {
          characters.addLast(character);
        }
      } else {
        characters.addLast(character);
      }


    }

    StringBuilder builder = new StringBuilder();
    for (Character character : characters) {
      builder.append(character);
    }
    return builder.toString();
  }
}
