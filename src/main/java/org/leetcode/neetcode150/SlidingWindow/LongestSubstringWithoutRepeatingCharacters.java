package org.leetcode.neetcode150.SlidingWindow;

import java.util.HashSet;
import java.util.LinkedList;

public class LongestSubstringWithoutRepeatingCharacters {

  public int lengthOfLongestSubstring(String s) {
    var set = new HashSet<Character>();
    int maxCounter = 0;

    int leftPointer = 0;
    int rightPointer = 0;
    while (rightPointer < s.length()) {
      var c = s.charAt(rightPointer);
      if (set.contains(c)){
        set.remove(s.charAt(leftPointer));
        leftPointer++;
      }else {
        set.add(c);
        maxCounter = Math.max(set.size(), maxCounter);
        rightPointer++;
      }
    }
    return maxCounter;
  }

  public int lengthOfLongestSubstringLinkedList(String s) {
    var linkedList = new LinkedList<Character>();
    int maxCounter = 0;

    int leftPointer = 0;
    int rightPointer = 0;
    while (rightPointer < s.length()) {
      var c = s.charAt(rightPointer++);
      while (linkedList.contains(c)) {
        linkedList.removeFirst();
        leftPointer++;
      }
      linkedList.addLast(c);
      maxCounter = Math.max(maxCounter, rightPointer - leftPointer);

    }
    return maxCounter;
  }

  public int lengthOfLongestSubstringBrute(String s) {
    var set = new HashSet<Character>();
    int maxCounter = 0;

    for (int i = 0; i < s.length(); i++) {
      int step = i;
      int counter = 0;

      while (step < s.length()) {
        var c = s.charAt(step);
        if (!set.contains(c)) {
          set.add(c);
          counter++;
          step++;
        } else {
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
