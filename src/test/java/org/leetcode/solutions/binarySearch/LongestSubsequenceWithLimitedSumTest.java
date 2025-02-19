package org.leetcode.solutions.binarySearch;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.leetcode.solutions.sorting.binarySearch.LongestSubsequenceWithLimitedSum;

class LongestSubsequenceWithLimitedSumTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int[] queries, int[] expectedResult) {
    var sortedMatrix = new LongestSubsequenceWithLimitedSum();
    var result = sortedMatrix.answerQueries(nums, queries);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21}, new int[]{2, 3, 4}),
        Arguments.of(new int[]{2,3,4,5}, new int[]{1}, new int[]{0})
    );
  }
}