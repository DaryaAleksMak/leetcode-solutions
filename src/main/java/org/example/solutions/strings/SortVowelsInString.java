package org.example.solutions.strings;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given a 0-indexed string s, permute s to get a new string t such that: All consonants remain in
 * their original places. More formally, if there is an index i with 0 <= i < s.length such that
 * s[i] is a consonant, then t[i] = s[i]. The vowels must be sorted in the nondecreasing order of
 * their ASCII values. More formally, for pairs of indices i, j with 0 <= i < j < s.length such that
 * s[i] and s[j] are vowels, then t[i] must not have a higher ASCII value than t[j]. Input: s =
 * "lEetcOde" Output: "lEOtcede"
 * <p>
 * Input: s = "lYmpH" Output: "lYmpH"
 */
public class SortVowelsInString {
//  if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
//      || y == 'u')

  public String sortVowels(String s) {

    char[] charArray = s.toCharArray();
    ArrayList<Character> vowels = new ArrayList<Character>();

    for (char c : charArray) {
      if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o'
          || c == 'O' || c == 'u' || c == 'U') {
        vowels.add(c);
      }
    }
    Collections.sort(vowels);

    StringBuffer buffer = new StringBuffer();
    int counter = 0;
    for (char c : charArray) {
      if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o'
          || c == 'O' || c == 'u' || c == 'U') {
        buffer.append(vowels.get(counter++));
      } else {
        buffer.append(c);
      }
    }

    return buffer.toString();
  }

}
