package org.leetcode.neetcode150.SlidingWindow;

import java.util.HashMap;

public class PermutationInString {

  /**
   * s1 = "adc", s2 = "dcda"
   */
  public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) return false;
    char[] s1Array = s1.toCharArray();
    char[] s2Array = s2.toCharArray();
    var result = false;

    var s1FreqCharArray = new int[26];
    var runningWindowArray = new int[26];

    for (int i = 0; i < s1.length(); i++) {
      s1FreqCharArray[s1Array[i] - 'a']++;
      runningWindowArray[s2Array[i] - 'a']++;
    }

    int match = 0;
    for (int i = 0; i < runningWindowArray.length; i++) {
      if (runningWindowArray[i] == s1FreqCharArray[i]) {
        match++;
      }
    }

    if (match == 26) {
      return true;
    }

    int windowSize = s1.length();
    int start;
    for (int end = windowSize; end < s2.length(); end++) {
      start = end - windowSize + 1;

      int removedIndex = s2Array[start - 1] - 'a';
      int refCount = s1FreqCharArray[removedIndex];
      //@formatter:off
        if (refCount == runningWindowArray[removedIndex]) match--; //lost matches
        if (refCount == --runningWindowArray[removedIndex]) match++; //get matches
        //@formatter:on

      int addedIndex = s2Array[end] - 'a';
      refCount = s1FreqCharArray[addedIndex];
      //@formatter:off
        if (refCount == runningWindowArray[addedIndex]) match--; //lost matches
        if (refCount == ++runningWindowArray[addedIndex]) match++; //get matches
        //@formatter:on
      if (match == 26) {
        return true;
      }
    }

    return result;
  }

  public boolean checkInclusionBruteForce(String s1, String s2) {
    var result = false;
    var map = new HashMap<Character, Integer>();
    for (int i = 0; i < s1.length(); i++) {
      var c = s1.charAt(i);
      var count = map.getOrDefault(c, 0);
      map.put(c, count + 1);
    }

    for (int start = 0; start < s2.length(); start++) {
      var c = s2.charAt(start);
      if (!map.containsKey(c)) {
        continue;
      }

      var end = start;
      var tempMap = new HashMap<>(map);
      while (end < s2.length()) {
        c = s2.charAt(end);
        var count = tempMap.getOrDefault(c, 0);
        if (count == 0) {
          break;
        } else {
          tempMap.put(c, --count);
        }
        end++;
      }

      if (end - start == s1.length()) {
        return true;
      }
    }
    return result;
  }
}
