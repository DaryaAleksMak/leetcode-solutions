package org.leetcode.solutions.hashtable;

import java.util.HashSet;
import java.util.Set;

public class FindMaximumNumberOfStringPairs {

  //@formatter:off
  /**
   * "cd", "ac", "dc", "ca", "zz"
   *  pairs  = 0
   * map {
   * (cd , 1)
   * (dc , 1)
   * }
   *
   * map {
   * (cd , 1),
   * (dc , 1),
   * (ac , 1),
   * (ca , 1),
   * }
   *
   * pairs  = 0
   *
   *map {
   * (cd , 2),
   * (dc , 2),
   * (ac , 1),
   * (ca , 1),
   * }
   *
   * map {
   * (cd , 2),
   * (dc , 2),
   * (ac , 2),
   * (ca , 2),
   *
   * map {
   * (cd , 2),
   * (dc , 2),
   * (ac , 2),
   * (ca , 2),
   * (zz , 1),
   * }
   *
   */
  //@formatter:on
  public int maximumNumberOfStringPairs(String[] words) {
    Set<String> set = new HashSet<>();

    int pairs = 0;
    for (String word : words) {
      String reversed = new StringBuilder(word).reverse().toString();
      if (set.contains(reversed)) {
        pairs++;
      } else {
        set.add(word);
      }
    }
    return pairs;
  }
}
