package org.leetcode.solutions.sorting;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SortTheStudentsByTheirKthScoreTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[][] score, int k, int[][] expectedResult) {
    var solution = new SortTheStudentsByTheirKthScore();
    var result = solution.sortTheStudents(score, k);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[][]{{10,6,9,1},{7,5,11,2},{4,8,3,15}}, 2,
            new int[][]{{7,5,11,2},{10,6,9,1},{4,8,3,15}}),

        Arguments.of(new int[][]{{3,4},{5,6}}, 0,
            new int[][]{{5,6},{3,4}})

        );
  }
}