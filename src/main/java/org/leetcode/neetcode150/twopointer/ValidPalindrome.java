package org.leetcode.neetcode150.twopointer;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    var lowerCaseString = s.toLowerCase().trim();

    if (lowerCaseString.isEmpty() || lowerCaseString.length() == 1) {
      return true;
    }

    var array = lowerCaseString.toCharArray();

    var leftPointer = 0;
    var rightPointer = array.length - 1;
    var result = false;

    while (leftPointer < rightPointer) {
      while (leftPointer < rightPointer && (!Character.isDigit(array[leftPointer]) &&
          !Character.isAlphabetic(array[leftPointer]))) {
        leftPointer++;
      }

      while (leftPointer < rightPointer && (!Character.isDigit(array[rightPointer]) &&
          !Character.isAlphabetic(array[rightPointer]))) {
        rightPointer--;
      }

      if (array[leftPointer] == array[rightPointer]) {
        leftPointer++;
        rightPointer--;
        result = true;
        continue;
      } else {
        return false;
      }
    }
    return result;
  }

}
