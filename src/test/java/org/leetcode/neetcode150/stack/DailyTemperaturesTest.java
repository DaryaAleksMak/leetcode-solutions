package org.leetcode.neetcode150.stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DailyTemperaturesTest {
  @ParameterizedTest
  @MethodSource("twoSumTestCases")
  void testSolution(int[] nums, int[] expectedResult) {
    var twoSumTaskSolutions = new DailyTemperatures();
    int[] result = twoSumTaskSolutions.dailyTemperatures(nums);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> twoSumTestCases() {
    return Stream.of(
        Arguments.of(new int[]{30, 38, 30, 36, 35, 40, 28}, new int[]{1, 4, 1, 2, 1, 0, 0}),
        Arguments.of(new int[]{22,21,20}, new int[]{0, 0, 0})
    );
  }

}