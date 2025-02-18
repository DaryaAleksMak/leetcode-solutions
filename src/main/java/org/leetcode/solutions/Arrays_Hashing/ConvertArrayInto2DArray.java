package org.leetcode.solutions.Arrays_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/ You
 * are given an integer array nums. You need to create a 2D array from nums satisfying the following
 * conditions:
 * <p>
 * The 2D array should contain only the elements of the array nums. Each row in the 2D array
 * contains distinct integers. The number of rows in the 2D array should be minimal. Return the
 * resulting array. If there are multiple answers, return any of them.
 * <p>
 * Note that the 2D array can have a different number of elements on each row.
 * <p>
 * Input: nums = [1,3,4,1,2,3,1] Output: [[1,3,4,2],[1,3],[1]]
 * <p>
 * Input: nums = [1,2,3,4] Output: [[4,3,2,1]]
 */
public class ConvertArrayInto2DArray {

  public List<List<Integer>> findMatrix(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> lists = new ArrayList<>();
    lists.add(new ArrayList<>());

    for (int num : nums) {
      boolean wasAdded = false;
      for (List<Integer> list : lists) {
        if (!list.contains(num)) {
          list.add(num);
          wasAdded = true;
          break;
        }
      }
      if (!wasAdded){
        List<Integer> newNode = new ArrayList<>();
        newNode.add(num);
        lists.addLast(newNode);
      }
    }
    return lists;
  }

}
