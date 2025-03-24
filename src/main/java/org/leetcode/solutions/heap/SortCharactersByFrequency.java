package org.leetcode.solutions.heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

  public String frequencySort(String s) {
    var map = new HashMap<Character, Integer>();
    var queue = new PriorityQueue<int[]>((a1, a2) -> Integer.compare(a2[1], a1[1]));
    var array = s.toCharArray();


    for (char c : array) {
      var count = map.getOrDefault(c, 0);
      map.put(c, ++count);
    }

    for (Character character : map.keySet()) {
      queue.add(new int[]{character, map.get(character)});
    }

    StringBuilder builder = new StringBuilder();
    while (!queue.isEmpty()) {
      int[] mostFreqAppear = queue.poll();
      int character = mostFreqAppear[0];
      int count = mostFreqAppear[1];
      while (count-- > 0) {
        builder.append((char) character);
      }
    }

    return builder.toString();
  }
}
