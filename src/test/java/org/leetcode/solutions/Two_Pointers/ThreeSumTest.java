package org.leetcode.solutions.Two_Pointers;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ThreeSumTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, List<List<Integer>> expectedResult) {
    var twoSumTaskSolutions = new ThreeSum();
    var result = twoSumTaskSolutions.threeSum(nums);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[]{0, 0, 0, 0}, List.of(List.of(0, 0, 0))),
        Arguments.of(new int[]{-1, 0, 1, 2, -1, -4},
            List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
        Arguments.of(new int[]{0, 1, 1}, List.of())
    );
  }
}