package org.leetcode.solutions.sorting.binarySearch;

//@formatter:off

/**
 * 4,3,2,-1
 * 3,2,1,-1
 * 1,1,-1,-2
 * -1,-1,-2,-3
 *
 *   10 9 8 7 6 5 4 3 2 1 0 -1 -2 -3 -4 -5 length = 15
 *   left = 0;
 *   right = lenght - 1;
 *
 *   1. step = length/2 = 15/2 = 7    array[7] = 3   3 < 0 -> false    2 1 0 -1 -2 -3 -4 -5
 *   2. step = step + (length - step) / 2 = 7 + (15 - 7)/2 = 11
 *      array[11] = -1    -1 < 0 true
 *   3. step = step - step/2 = 10 + 10/2 = 15
 *
 *
 */
//@formatter:on

public class CountNegativeNumbersInSortedMatrix {

  public int countNegatives(int[][] grid) {
    int result = 0;
    for (int[] ints : grid) {
      int left = 0;
      int right = ints.length - 1;
      while (left <= right) {
        int mid = (left + right) / 2;
        if (ints[mid] < 0) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }
      result += ints.length - left;

    }

    return result;
  }
}
