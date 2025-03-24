package org.leetcode.solutions.heap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindXSumOfAllKLongSubarraysITest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int k, int x, int[] expectedResult) {
    var solution = new FindXSumOfAllKLongSubarraysI();
    var result = solution.findXSum(nums, k, x);
    assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{1, 1, 2, 2, 3, 4, 2, 3}, 6, 2, new int[]{6, 10, 12}),
        Arguments.of(new int[]{9, 2, 2}, 3, 3, new int[]{6, 10, 12})
    );
  }
}