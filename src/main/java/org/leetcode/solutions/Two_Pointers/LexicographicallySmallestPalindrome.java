package org.leetcode.solutions.Two_Pointers;

public class LexicographicallySmallestPalindrome {

  public String makeSmallestPalindrome(String s) {
    var charArray = s.toCharArray();
    for (int i = 0; i < charArray.length / 2; i++) {
      var oppositeIndex = (charArray.length - 1 - i);
      if (charArray[i] < charArray[oppositeIndex]) {
        charArray[oppositeIndex] = charArray[i];
      }
      if (charArray[i] > charArray[oppositeIndex]) {
        charArray[i] = charArray[oppositeIndex];
      }
    }

    return new String(charArray);
  }
}
