package org.leetcode.solutions.Two_Pointers;

public class ShortestDistanceToCharacter {

  public int[] shortestToChar(String s, char c) {
    int nearestCharAppearance = s.indexOf(c);
    int nextCharAppearance = nearestCharAppearance;

    int[] result = new int[s.length()];

    for (int i = 0; i < s.length(); i++) {
      if (i == nextCharAppearance) {
        nearestCharAppearance = i;
        nextCharAppearance = s.indexOf(c, nextCharAppearance + 1);
        result[i] = 0;
        continue;
      }

      result[i] = Math.min(Math.abs(i - nearestCharAppearance), Math.abs(i - nextCharAppearance));
    }

    return result;
  }

}
