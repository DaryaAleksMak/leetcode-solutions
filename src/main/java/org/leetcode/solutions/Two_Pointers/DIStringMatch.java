package org.leetcode.solutions.Two_Pointers;

public class DIStringMatch {

  // @formatter:off
  /**
   * IDID -> [][][][][]
   * 1. I  -> [0][4][][][]
   * 2. D  -> [0][4][1][][]
   * 3. I  -> [0][4][1][3][]
   * 4. D  -> [0][4][1][3][2]
   */

  /**
   * i = 0      1      2       3   0 1 3 4 5
   *  I(0,1) D(1,2) I(2,3) D(3,4) -> [][][][][]
   * 0. I (0,1) -> [0][4][][][]
   * 1. D (1,2) -> [0][4][1][][]
   * 2. I -> [0][4][1][3][]
   * 3. I -> [0][4][1][2][3]
   */
// @formatter:on
  public int[] diStringMatch(String s) {
    int[] result = new int[s.length() + 1];

    char iChar = 'I';
    int low = 0;
    int high = s.length();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == iChar) {
       result[i] = low ++;
        } else {
          result[i] = high--;
        }
      }
    result[s.length()] = low;

    return result;
  }
}
