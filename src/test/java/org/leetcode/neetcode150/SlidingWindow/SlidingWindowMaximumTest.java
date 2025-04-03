package org.leetcode.neetcode150.SlidingWindow;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SlidingWindowMaximumTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int k, int[] expectedResult) {
    var solution = new SlidingWindowMaximum();
    var result = solution.maxSlidingWindow(nums, k);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{9, 10, 9, -7, -4, -8, 2, -6}, 5, new int[]{10, 10, 9, 2}),
        Arguments.of(new int[]{1, 3, 1, 2, 0, 5}, 3, new int[]{3, 3, 2, 5})
    );
  }
}