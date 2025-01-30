package org.example.solutions.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * 3,  7,  8 9,  11, 13 15, 16, 17
 * <p>
 * 1,10,4,2 9,3,8,7 15,16,17,12
 */

public class LuckyNumbersInMatrix {

  public List<Integer> luckyNumbers(int[][] matrix) {
    List<Integer> luckyNumbers = new ArrayList<>();

    for (int i = 0; i < matrix.length; i++) {
      var luckyValueInRow = Integer.MAX_VALUE;
      var columnIndex = 0;
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] < luckyValueInRow) {
          luckyValueInRow = matrix[i][j];
          columnIndex = j;
        }
      }

      boolean stillLucky = true;
      for (int j = 0; j < matrix.length; j++) {
        if (luckyValueInRow < matrix[j][columnIndex]) {
          stillLucky = false;
        }
      }
      if (stillLucky) {
        luckyNumbers.add(luckyValueInRow);
      }

    }
    return luckyNumbers;

  }

}
