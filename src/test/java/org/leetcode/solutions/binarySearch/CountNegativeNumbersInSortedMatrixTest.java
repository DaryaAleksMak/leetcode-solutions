package org.leetcode.solutions.binarySearch;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.leetcode.solutions.sorting.binarySearch.CountNegativeNumbersInSortedMatrix;

class CountNegativeNumbersInSortedMatrixTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[][] inputMatrix, int expectedResult) {
    var sortedMatrix = new CountNegativeNumbersInSortedMatrix();
    var result = sortedMatrix.countNegatives(inputMatrix);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[][]{{5, 1, 0}, {-5, -5, -5}}, 3),
        Arguments.of(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}},
            8),
        Arguments.of(new int[][]{{3, 2}, {1, 0}}, 0)
    );
  }
}