package org.leetcode.solutions.matrix;

/**
 * Your NeighborSum object will be instantiated and called as such: NeighborSum obj = new
 * NeighborSum(grid); int param_1 = obj.adjacentSum(value); int param_2 = obj.diagonalSum(value);
 * <p>
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 * Implement the NeighborSum class:
 * <p>
 * NeighborSum(int [][]grid) initializes the object. int adjacentSum(int value) returns the sum of
 * elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom
 * of value in grid. int diagonalSum(int value) returns the sum of elements which are diagonal
 * neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of
 * value in grid.
 * <p>
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 * Implement the NeighborSum class:
 * <p>
 * NeighborSum(int [][]grid) initializes the object. int adjacentSum(int value) returns the sum of
 * elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom
 * of value in grid. int diagonalSum(int value) returns the sum of elements which are diagonal
 * neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of
 * value in grid.
 * <p>
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 * Implement the NeighborSum class:
 * <p>
 * NeighborSum(int [][]grid) initializes the object. int adjacentSum(int value) returns the sum of
 * elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom
 * of value in grid. int diagonalSum(int value) returns the sum of elements which are diagonal
 * neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of
 * value in grid.
 * <p>
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 * Implement the NeighborSum class:
 * <p>
 * NeighborSum(int [][]grid) initializes the object. int adjacentSum(int value) returns the sum of
 * elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom
 * of value in grid. int diagonalSum(int value) returns the sum of elements which are diagonal
 * neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of
 * value in grid.
 * <p>
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 * Implement the NeighborSum class:
 * <p>
 * NeighborSum(int [][]grid) initializes the object. int adjacentSum(int value) returns the sum of
 * elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom
 * of value in grid. int diagonalSum(int value) returns the sum of elements which are diagonal
 * neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of
 * value in grid.
 * <p>
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 * Implement the NeighborSum class:
 * <p>
 * NeighborSum(int [][]grid) initializes the object. int adjacentSum(int value) returns the sum of
 * elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom
 * of value in grid. int diagonalSum(int value) returns the sum of elements which are diagonal
 * neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of
 * value in grid.
 * <p>
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 * Implement the NeighborSum class:
 * <p>
 * NeighborSum(int [][]grid) initializes the object. int adjacentSum(int value) returns the sum of
 * elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom
 * of value in grid. int diagonalSum(int value) returns the sum of elements which are diagonal
 * neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of
 * value in grid.
 * <p>
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 * Implement the NeighborSum class:
 * <p>
 * NeighborSum(int [][]grid) initializes the object. int adjacentSum(int value) returns the sum of
 * elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom
 * of value in grid. int diagonalSum(int value) returns the sum of elements which are diagonal
 * neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of
 * value in grid.
 * <p>
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 * Implement the NeighborSum class:
 * <p>
 * NeighborSum(int [][]grid) initializes the object. int adjacentSum(int value) returns the sum of
 * elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom
 * of value in grid. int diagonalSum(int value) returns the sum of elements which are diagonal
 * neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of
 * value in grid.
 */

/**
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 * Implement the NeighborSum class:
 *
 * NeighborSum(int [][]grid) initializes the object.
 * int adjacentSum(int value) returns the sum of elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom of value in grid.
 * int diagonalSum(int value) returns the sum of elements which are diagonal neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of value in grid.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 0 1 2
 * 3 4 5
 * 6 7 8
 */


class NeighborSum {

  private final int[][] grid;
  private final Map<Integer, Integer[]> valuesToIndexes = new HashMap<>();

  public NeighborSum(int[][] grid) {
    this.grid = grid;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid.length; j++) {
        valuesToIndexes.put(grid[i][j], new Integer[]{i, j});
      }
    }
  }

  public int adjacentSum(int value) {
    Integer[] indexes = valuesToIndexes.get(value);
    Integer rowIndexValue = indexes[0];
    Integer columnIndexValue = indexes[1];

    int topValue = 0;
    int bottomValue = 0;
    int leftValue = 0;
    int rightValue = 0;

    if (rowIndexValue != 0) {
      topValue = grid[rowIndexValue - 1][columnIndexValue];
    }

    if (rowIndexValue < grid.length - 1) {
      bottomValue = grid[rowIndexValue + 1][columnIndexValue];
    }

    if (columnIndexValue != 0) {
      leftValue = grid[rowIndexValue][columnIndexValue - 1];
    }

    if (columnIndexValue < grid.length - 1) {
      rightValue = grid[rowIndexValue][columnIndexValue + 1];
    }

    return topValue + bottomValue + leftValue + rightValue;
  }

  public int diagonalSum(int value) {
    Integer[] indexes = valuesToIndexes.get(value);
    Integer rowIndexValue = indexes[0];
    Integer columnIndexValue = indexes[1];

    int topLeftValue = 0;
    int topRightValue = 0;
    int bottomLeftValue = 0;
    int bottomRightValue = 0;

    if (rowIndexValue != 0 && columnIndexValue != 0) {
      topLeftValue = grid[rowIndexValue - 1][columnIndexValue - 1];
    }

    if (rowIndexValue != 0 && columnIndexValue < grid.length - 1) {
      topRightValue = grid[rowIndexValue - 1][columnIndexValue + 1];
    }

    if (rowIndexValue < grid.length - 1 && columnIndexValue != 0) {
      bottomLeftValue = grid[rowIndexValue + 1][columnIndexValue - 1];
    }

    if (rowIndexValue < grid.length - 1 && columnIndexValue < grid.length - 1) {
      bottomRightValue = grid[rowIndexValue + 1][columnIndexValue + 1];
    }
    return topLeftValue + topRightValue + bottomLeftValue + bottomRightValue;
  }
}
