package org.leetcode.solutions.Two_Pointers;

public class ReversePrefixOfWord {

  public String reversePrefix(String word, char ch) {
    var indexOfCh = word.indexOf(ch);
    if (indexOfCh == -1) {
      return word;
    }

    char[] wordCharArray = word.toCharArray();

    for (int i = indexOfCh; i > indexOfCh / 2; i--) {
      int pairIndex = (indexOfCh - i);
      char temp = wordCharArray[i];
      wordCharArray[i] = wordCharArray[pairIndex];
      wordCharArray[pairIndex] = temp;
    }
    return new String(wordCharArray);
  }

}

/**
 * abcdefd    d dcba efd
 */
