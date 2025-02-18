package org.leetcode.solutions.sorting;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MinimumNumberGameTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int[] expectedResult) {
    var solution = new MinimumNumberGame();
    var result = solution.numberGame(nums);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{5, 4, 2, 3}, new int[]{3, 2, 5, 4}),
        Arguments.of(new int[]{2, 5}, new int[]{5, 2})
    );
  }


}