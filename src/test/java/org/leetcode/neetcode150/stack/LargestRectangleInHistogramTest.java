package org.leetcode.neetcode150.stack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LargestRectangleInHistogramTest {

  @ParameterizedTest
  @MethodSource("twoSumTestCases")
  void testSolution(int[] heights, int expectedResult) {
    var twoSumTaskSolutions = new LargestRectangleInHistogram();
    int result = twoSumTaskSolutions.largestRectangleArea(heights);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> twoSumTestCases() {
    return Stream.of(
        Arguments.of(new int[]{2,1,5,6,2,3},10)
    );
  }
}