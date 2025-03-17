package org.leetcode.neetcode150.array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {

  //@formatter:off
  /**
   * input array: 0,3,7,2,5,8,4,6,0,1
   * hashset:     0,3,7,2,5,8,4,6,1
   */
  //@formatter:on
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return 1;
    }

    Set<Integer> numSet = new HashSet<>();
    for (int num : nums) {
      numSet.add(num);
    }

    int longest = 0;

    for (int num : numSet) {
      if (numSet.contains(num - 1)) {
        continue;
      }

      int length = 1;

      while (numSet.contains(num + length)) {
        length++;
      }

      longest = Math.max(longest, length);
    }

    return longest;
  }

  //input array: 0,3,7,2,5,8,4,6,0,1
  //tree set:    0,0,1,2,3,4,5,6,7,8

  //input array: 9,1,4,7,3,-1,0,5,8,-1,6
  //tree set:    -1,-1,0,1,3,4,5,6,7,8,9

  public int longestConsecutiveBrute(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    TreeSet<Integer> treeSet = new TreeSet<>();
    for (int num : nums) {
      treeSet.add(num);
    }

    int maxConsecutiveLength = 0;

    Integer[] sortedArray = treeSet.toArray(new Integer[treeSet.size()]);

    for (int i = 0; i < sortedArray.length; i++) {
      int currentConsecutiveLength = 1;

      int j = i;
      while (j < sortedArray.length - 1 && sortedArray[j + 1] - sortedArray[j] == 1) {
        currentConsecutiveLength++;
        j++;
      }

      i = i + currentConsecutiveLength - 1;
      maxConsecutiveLength = Math.max(currentConsecutiveLength, maxConsecutiveLength);
    }

    return maxConsecutiveLength;

  }
}
