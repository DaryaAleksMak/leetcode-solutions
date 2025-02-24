package org.leetcode.solutions.Two_Pointers;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FourSumTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int target, List<List<Integer>> expectedResult) {
    var twoSumTaskSolutions = new FourSum();
    var result = twoSumTaskSolutions.fourSum(nums, target);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296,
            List.of()),
        Arguments.of(new int[]{1, 0, -1, 0, -2, 2}, 0,
            List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1))),
        Arguments.of(new int[]{2, 2, 2, 2, 2}, 8, List.of(List.of(2, 2, 2, 2)))
    );
  }
}