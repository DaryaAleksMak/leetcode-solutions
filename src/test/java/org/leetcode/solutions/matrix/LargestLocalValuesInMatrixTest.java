package org.leetcode.solutions.matrix;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LargestLocalValuesInMatrixTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[][] matrix, int[][] expectedResult) {
    var solution = new LargestLocalValuesInMatrix();
    var result = solution.largestLocal(matrix);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}},
            new int[][]{{9, 9}, {8, 6}}),
        Arguments.of(new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 2, 1, 1}, {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1}}, new int[][]{{2, 2, 2}, {2, 2, 2}, {2, 2, 2}}));
  }
}