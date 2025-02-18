package org.leetcode.solutions.Two_Pointers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * ababcbacadefegdehijhklij
 */

public class PartitionLabels {

  public List<Integer> partitionLabels(String s) {
    var linkedHashMap = new LinkedHashMap<Character, Integer[]>();
    char[] charArray = s.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      Integer[] charAppearDetails = linkedHashMap.get(charArray[i]);
      if (charAppearDetails == null) {
        var charIndexes = new Integer[]{i, i};
        linkedHashMap.put(charArray[i], charIndexes);
      } else {
        charAppearDetails[1] = i;
      }
    }

    Integer first = null;
    Integer last = null;

    var result = new ArrayList<Integer>();

    for (Integer[] charDetail : linkedHashMap.values()) {
      var currentCharFirst = charDetail[0];
      var currentCharLast = charDetail[1];

      if (first == null) {
        first = currentCharFirst;
        last = currentCharLast;
        continue;
      }
      if (currentCharFirst < last) {
        if (currentCharLast > last) {
          last = currentCharLast;
        }
      } else {
        result.add(last - first + 1);
        first = currentCharFirst;
        last = currentCharLast;
      }
    }
    result.add(last - first + 1);
    return result;
  }

}
