package org.leetcode.neetcode150.SlidingWindow;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;

public class LongestSubstringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String s) {
    var set = new HashSet<Character>();
    int maxCounter = 0;

    for (int i = 0; i < s.length(); i++){
      int step = i;
      int counter = 0;

      while (step < s.length()){
        var c = s.charAt(step);
        if (!set.contains(c)){
          set.add(c);
          counter++;
          step++;
        }else {
          maxCounter = Math.max(maxCounter, counter);
          set.clear();
          break;
        }
      }

      maxCounter = Math.max(maxCounter, counter);
      set.clear();
    }

    return maxCounter;
  }
}
