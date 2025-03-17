package org.leetcode.solutions.Two_Pointers;

import java.util.ArrayList;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    s = s.toLowerCase().trim();
    if (s.isEmpty() || s.isBlank() || s.length() == 1) {
      return true;
    }

    var leftPointer = 0;
    var rightPointer = s.length() - 1;

    var result = false;

    while (leftPointer < rightPointer) {
      while (leftPointer < rightPointer && !Character.isDigit(s.charAt(leftPointer)) && !Character.isAlphabetic(
          s.charAt(leftPointer))) {
        leftPointer++;
      }

      while (leftPointer < rightPointer && (!Character.isDigit(s.charAt(rightPointer)) &&
          !Character.isAlphabetic(s.charAt(rightPointer)))) {
        rightPointer--;
      }

      if (s.charAt(leftPointer) == s.charAt(rightPointer)) {
        leftPointer++;
        rightPointer--;
        result = true;
      } else {
        return false;
      }
    }
    return result;
  }

  public boolean isPalindrome1(String s) {
    if (s.isEmpty() || s.isBlank()) {
      return true;
    }

    char[] charArray = s.toCharArray();
    var cleanArray = new ArrayList<Character>();
    int index = 0;
    for (int i = 0; i < charArray.length; i++) {
      if (Character.isAlphabetic(charArray[i]) || Character.isDigit(charArray[i])) {
        cleanArray.add(index++, Character.toLowerCase(charArray[i]));
      }
    }

    if (cleanArray.isEmpty()) {
      return true;
    }

    int start = 0;
    int end = cleanArray.size() - 1;
    while (start < end) {
      if (!cleanArray.get(start++).equals(cleanArray.get(end--))) {
        return false;
      }

    }
    return true;
  }

}
