package org.leetcode.neetcode150.SlidingWindow;

import java.util.HashMap;

public class MaximumLengthSubstringWithTwoOccurrences {

  public int maximumLengthSubstring(String s) {
    var array = s.toCharArray();
    var map = new HashMap<Character, Integer>();

    int left = 0;
    int right = 0;
    var maxSubstringLength = 0;
    while (right < array.length) {
      var cCurrent = array[right];
      var count = map.getOrDefault(cCurrent, 0);
      count++;
      map.put(cCurrent, count);

      while (map.get(cCurrent) > 2){
        var leftChar = array[left];
        var leftCharCount = map.get(leftChar);
        leftCharCount--;
        map.put(leftChar, leftCharCount);
        left++;
      }

      maxSubstringLength = Math.max(right - left + 1, maxSubstringLength);
      right++;
    }
    return maxSubstringLength;
  }
}
