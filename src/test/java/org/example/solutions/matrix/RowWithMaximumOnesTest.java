package org.example.solutions.matrix;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RowWithMaximumOnesTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[][] matrix, int[] expectedResult) {
    var solution = new RowWithMaximumOnes();
    var result = solution.rowAndMaximumOnes(matrix);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[][]{{0, 1}, {1, 0}},
            new int[]{0, 1}),
        Arguments.of(new int[][]{{0, 0, 0}, {0, 1, 1}},
            new int[]{1, 2}),
        Arguments.of(new int[][]{{0, 0}, {1, 1}, {0, 0}},
            new int[]{1, 2})
    );
  }

}