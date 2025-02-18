package org.leetcode.solutions.matrix;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LuckyNumbersInMatrixTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[][] matrix, List<Integer> expectedResult) {
    var solution = new LuckyNumbersInMatrix();
    var result = solution.luckyNumbers(matrix);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}, List.of(15)),
        Arguments.of(new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}}, List.of(12)),
        Arguments.of(new int[][]{{7, 8}, {1, 2}}, List.of(7))
    );
  }
}