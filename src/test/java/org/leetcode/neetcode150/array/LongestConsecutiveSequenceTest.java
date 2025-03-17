package org.leetcode.neetcode150.array;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestConsecutiveSequenceTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int expectedResult) {
    var solution = new LongestConsecutiveSequence();
    var result = solution.longestConsecutive(nums);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{1,0,-1}, 3),
        Arguments.of(new int[]{0}, 1),
        Arguments.of(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}, 7),
        Arguments.of(new int[]{1, 2, 0, 1}, 3),
        Arguments.of(new int[]{100, 4, 200, 1, 3, 2}, 4),
        Arguments.of(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}, 9),
        Arguments.of(new int[]{0, 0,}, 1)
    );
  }
}