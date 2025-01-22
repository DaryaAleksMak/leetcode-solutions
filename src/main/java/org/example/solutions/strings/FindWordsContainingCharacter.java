package org.example.solutions.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a 0-indexed array of strings words and a character x. Return an array of indices
 * representing the words that contain the character x.
 * <p>
 * Note that the returned array may be in any order. Input: words = ["leet","code"], x = "e" Output:
 * [0,1]
 * <p>
 * Input: words = ["abc","bcd","aaaa","cbc"], x = "a" Output: [0,2]
 * <p>
 * Input: words = ["abc","bcd","aaaa","cbc"], x = "z" Output: []
 */
public class FindWordsContainingCharacter {

  public List<Integer> findWordsContaining(String[] words, char x) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      if (words[i].indexOf(x) >= 0) {
        list.add(i);
      }
    }
    return list;

  }


}
