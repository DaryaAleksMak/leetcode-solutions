package org.leetcode.solutions.matrix;

/**
 * Example 1:
 */
public class LargestLocalValuesInMatrix {

  public int[][] largestLocal(int[][] grid) {
    int[][] result = new int[grid.length - 2][grid.length - 2];
    int rowResult = 0;
    int columnResult = 0;
    for (int i = 0; i <= grid.length - 3; i++) {
      for (int j = 0; j <= grid.length - 3; j++) {
        int max = 0;

        max = Math.max(max, grid[i][j]);
        max = Math.max(max, grid[i][j + 1]);
        max = Math.max(max, grid[i][j + 2]);

        max = Math.max(max, grid[i + 1][j]);
        max = Math.max(max, grid[i + 1][j + 1]);
        max = Math.max(max, grid[i + 1][j + 2]);

        max = Math.max(max, grid[i + 2][j]);
        max = Math.max(max, grid[i + 2][j + 1]);
        max = Math.max(max, grid[i + 2][j + 2]);

        result[rowResult][columnResult] = max;
        if (columnResult == (grid.length - 3)) {
          columnResult = 0;
          rowResult++;
        } else {
          columnResult++;
        }
      }
    }
    return result;

  }

}
