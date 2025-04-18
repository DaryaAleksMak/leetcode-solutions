package org.leetcode.solutions.matrix;

/**
 * Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum
 * count of ones, and the number of ones in that row.
 * <p>
 * In case there are multiple rows that have the maximum count of ones, the row with the smallest
 * row number should be selected.
 * <p>
 * Return an array containing the index of the row, and the number of ones in it.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: mat = [[0,1],[1,0]] Output: [0,1] Explanation: Both rows have the same number of 1's. So
 * we return the index of the smaller row, 0, and the maximum count of ones (1). So, the answer is
 * [0,1]. Example 2:
 * <p>
 * Input: mat = [[0,0,0],[0,1,1]] Output: [1,2] Explanation: The row indexed 1 has the maximum count
 * of ones (2). So we return its index, 1, and the count. So, the answer is [1,2]. Example 3:
 * <p>
 * Input: mat = [[0,0],[1,1],[0,0]] Output: [1,2] Explanation: The row indexed 1 has the maximum
 * count of ones (2). So the answer is [1,2].
 */
public class RowWithMaximumOnes {

  public int[] rowAndMaximumOnes(int[][] mat) {
    int maxSum = 0;
    int index = 0;
    for (int i = 0; i < mat.length; i++) {
      int[] values = mat[i];
      int sum = 0;
      for (int j = values.length - 1; j >= 0; j--) {
        if (values[j] != 0) {
          sum += values[j];
        }
      }

      if (sum > maxSum) {
        maxSum = sum;
        index = i;
      }
    }

    return new int[]{index, maxSum};
  }
}
