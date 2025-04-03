package org.leetcode.solutions.strings;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.leetcode.demoTask.TestJobTask;


class TestJobTaskTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int length, int numberOfQueries, String inputString, int[][] queries,
      int expectedResult) {
    var solution = new TestJobTask();
    solution.solution(length, numberOfQueries, inputString, queries);
    Assertions.assertTrue(true);

  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(8, 3, "ABBABAAB",
           new int[][]{{1, 4, 4}, {2, 6, 1}, {3, 7, 5}}, 3));
  }
}