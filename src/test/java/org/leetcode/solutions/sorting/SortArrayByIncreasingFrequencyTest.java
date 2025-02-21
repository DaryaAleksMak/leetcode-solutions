package org.leetcode.solutions.sorting;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.leetcode.solutions.sorting.priorityQueue.SortArrayByIncreasingFrequency;


class SortArrayByIncreasingFrequencyTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int[] expectedResult) {
    var solution = new SortArrayByIncreasingFrequency();
    var result = solution.frequencySort(nums);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{-1,1,-6,4,5,-6,1,4,1}, new int[]{5,-1,4,4,-6,-6,1,1,1}),
        Arguments.of(new int[]{1, 1, 2, 2, 2, 3}, new int[]{3, 1, 1, 2, 2, 2}),
        Arguments.of(new int[]{2, 5}, new int[]{5, 2})
    );
  }
}