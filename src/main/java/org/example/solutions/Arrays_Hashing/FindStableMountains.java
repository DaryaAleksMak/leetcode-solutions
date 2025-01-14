package org.example.solutions.Arrays_Hashing;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-indices-of-stable-mountains/description/
 */
public class FindStableMountains {

  /**
   * [1,2,3,4,5]  threshold = 2  [4,5] is stable
   * [1,0]
   * [2,1]
   * [3,2]
   * [4,3]
   * [5,4]
   *
   * [10,1,10,1,10]  threshold = 3 [1,1] is stable
   *
   * [10,1,10,1,10]  threshold = 10 [] mo stable mountains
   *
   */

  public List<Integer> stableMountains(int[] height, int threshold) {
    var result = new ArrayList<Integer>();
    for (int i = 0; i < height.length - 1; i++) {
      if (height[i] > threshold){
        result.add(i + 1);
      }
    }
    return result;
  }
}
