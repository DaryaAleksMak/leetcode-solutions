package org.example.solutions.matrix;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TheKWeakestRowsInMatrixTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[][] matrix, int k, int[] expectedResult) {
    var solution = new TheKWeakestRowsInMatrix();
    var result = solution.kWeakestRows(matrix, k);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}}, 3, new int[]{2,0,3}),
        Arguments.of(new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}}, 2, new int[]{0,2}));
  }

}