package org.leetcode.solutions.sorting;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.leetcode.solutions.sorting.countingSearch.MinimumAverageOfSmallestAndLargestElements;

class MinimumAverageOfSmallestAndLargestElementsTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, double expectedResult) {
    var solution = new MinimumAverageOfSmallestAndLargestElements();
    var result = solution.minimumAverage(nums);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{7, 8, 3, 4, 15, 13, 4, 1}, 5.5),
        Arguments.of(new int[]{1, 9, 8, 3, 10, 5}, 5.5)
    );
  }
}