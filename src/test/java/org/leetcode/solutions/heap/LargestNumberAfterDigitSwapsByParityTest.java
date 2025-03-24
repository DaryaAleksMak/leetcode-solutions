package org.leetcode.solutions.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LargestNumberAfterDigitSwapsByParityTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int num, int expectedResult) {
    var solution = new LargestNumberAfterDigitSwapsByParity();
    var result = solution.largestInteger(num);
    assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(266, 662),
        Arguments.of(1234, 3412),
        Arguments.of(65875, 87655)
    );
  }
}