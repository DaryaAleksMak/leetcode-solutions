package org.leetcode.solutions.Arrays_Hashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

  private final static String delimeter = "@";

  public String encode(List<String> strs) {
    StringBuilder builder = new StringBuilder();
    for (String str : strs) {
      int length = str.length();
      builder.append(length).append(delimeter).append(str);
    }
    return builder.toString();
  }

  public List<String> decode(String str) {
    char[] charArray = str.toCharArray();

    ArrayList<String> result = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      StringBuilder currentWordLengthInStr = new StringBuilder();
      while (Character.isDigit(charArray[i])) {
        currentWordLengthInStr.append(charArray[i]);
        i++;
      }
      int currentWordLength = Integer.parseInt(currentWordLengthInStr.toString());

      StringBuilder currentWord = new StringBuilder();
      while (currentWordLength > 0) {
        currentWord.append(charArray[++i]);
        currentWordLength--;
      }

      result.add(currentWord.toString());
    }
    return result;
  }

}
