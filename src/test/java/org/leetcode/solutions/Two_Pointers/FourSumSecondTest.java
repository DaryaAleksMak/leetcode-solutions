package org.leetcode.solutions.Two_Pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FourSumSecondTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums1, int[] nums2, int[] nums3, int[] nums4, int expectedResult) {
    var twoSumTaskSolutions = new FourSumSecond();
    var result = twoSumTaskSolutions.fourSumCount(nums1, nums2, nums3, nums4);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[]{-1,-1}, new int[]{-1,1}, new int[]{-1,1}, new int[]{1,-1}, 6),
        Arguments.of(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}, 2),
        Arguments.of(new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}, 1)
    );
  }
}