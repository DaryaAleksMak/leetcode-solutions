package org.leetcode.neetcode150.SlidingWindow;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public class MinimumWindowSubstring {

  //@formatter:off
  /**
   *

  s = "AADOBECODEABANC", t = "AABC" reference={A-2, B-1, C-1}
  Output: "ABANC"
  Dynamic size sliding window
   AADOBECODEBANC    start=0 end=0 matches=1 not all included
   ^                 queue = {A - 0} end++
   AADOBECODEBANC    start=0 end=1 matches=2 not all included
   ^^                queue = {A - 0, A - 1} end++
   AADOBECODEBANC    start=0 end=2 matches=2 not all included
   ^ ^               queue = {A - 0, A - 1} end++
   AADOBECODEBANC    start=0 end=3 matches=2 not all included
   ^  ^              queue = {A - 0, A - 1} end++
   AADOBECODEBANC    start=0 end=4 matches=3 not all included
   ^   ^             queue = {A-0, A-1, B-4} end++
   AADOBECODEBANC    start=0 end=5 matches=3 not all included
   ^    ^             queue = {A-0, A-1, B-4} end++
   AADOBECODEBANC    start=0 end=6 matches=4  all included
   ^     ^           queue = {A-0, A-1, B-4, C-6}
                     subArrayMinSize = end-start+1 = 7 [AADOBEC]
   ----->  queue.removeFirst start = first_index matches-- end++
   AADOBECODEABANC    start=1 end=7 matches=3 not all included
    ^     ^           queue = {A-1, B-4, C-6}
   AADOBECODEABANC    start=1 end=8 matches=3 not all included
    ^      ^          queue = {A-1, B-4, C-6}
   AADOBECODEABANC    start=1 end=9 matches=3 not all included
    ^       ^         queue = {A-1, B-4, C-6}
   AADOBECODEABANC    start=1 end=10 matches=4 all included
    ^        ^        queue = {A-1, B-4, C-6, A-10}
   ----->  queue.removeFirst start = first_index matches-- end++
                      queue = {B-4, C-6, A-10}
   AADOBECODEABANC    start=4 end=11 matches=3 not all included
       ^      ^        queue = {B-4, C-6, A-10, B=11}
   AADOBECODEABANC    start=4 end=12 matches=4  all included
       ^       ^        queue = {B-4, C-6, A-10, B=11, A-12}
   ----->  queue.removeFirst start = first_index matches-- end++
            queue = {C-6, A-10, B=11, A-12}
                      (while !match) start = 6
            queue = {A-10, B=11, A-12}
                      (while !match) start = 10
   AADOBECODEABANC    start=4 end=13 matches=3 not all included
             ^  ^     queue = {A-10, B=11, A-12}
   AADOBECODEABANC    start=4 end=13 matches=4  all included
             ^   ^    queue = {A-10, B=11, A-12, C-14}




   */
  //@formatter:on
  public String minWindow(String s, String t) {
    if (t.isEmpty()) return t;
    var referenceMap = new HashMap<Character, Integer>();
    var runningMap = new HashMap<Character, Integer>();

    var sArray = s.toCharArray();
    var referenceArray = t.toCharArray();

    for (Character c : referenceArray) {
      referenceMap.put(c, referenceMap.getOrDefault(c, 0)+1);
    }

    //find start of sliding window
    int end = 0;
    int start = 0;
    int matches = 0;
    int minSizeSubArray = Integer.MAX_VALUE;
    int l = 0;
    int r = 0;

    // init first window
    while (end < s.length()) {
      var currentC = sArray[end];
      var frequency = runningMap.getOrDefault(currentC, 0);
      ++frequency;
      runningMap.put(currentC, frequency);

      if (!referenceMap.containsKey(currentC)) {
        end++;
        continue;
      }

      if (Objects.equals(referenceMap.get(currentC), frequency)) {
        matches += referenceMap.get(currentC);
      }

      while (matches == t.length()) {
        var currentSubSize = end - start + 1;
        if (currentSubSize < minSizeSubArray) {
          minSizeSubArray = currentSubSize;
          l = start;
          r = end + 1;
        }
        currentC = sArray[start];
        var removedFirstCount = runningMap.remove(currentC);
        --removedFirstCount;
        runningMap.put(currentC, removedFirstCount);
        if (referenceMap.containsKey(currentC) && referenceMap.get(currentC) > removedFirstCount) {
          matches-= referenceMap.get(currentC);
        }
        start++;
        if (runningMap.isEmpty()) break;
      }
      end++;
    }

    return minSizeSubArray == Integer.MAX_VALUE ? "" : s.substring(l, r);
  }
}
