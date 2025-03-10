package org.leetcode.solutions.Arrays_Hashing;

import java.util.ArrayList;
import java.util.List;

/**
 * {"hello", "word", "!"}
 * Flow:
 * init some delimiter for encoding and decoding
 *
 * encode:
 * add at the start of each word length of it + delimiter
 *  result of encoding: "5#hello4#1#!"
 * decoding:
 * 1. string -> charArray: "5#hello4#1#!" ->  ['5','#','h','e','l','l','o','4','#','1','#','!']
 * 2. read char array while digit is it length of next word  = currentWordLength
 * 3. read next currentWordLength chars with skipping delimiter
 * 4. build word with StringBuilder and add it to result list
 * 5. repeat it while we don't read all chars!
 */
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
