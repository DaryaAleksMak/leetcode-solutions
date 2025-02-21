package org.leetcode.solutions.sorting;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaximumProductOfTwoElementsInArrayTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, double expectedResult) {
    var solution = new MaximumProductOfTwoElementsInArray_1464();
    var result = solution.maxProduct(nums);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{3,4,5,2}, 12),
        Arguments.of(new int[]{1,5,4,5}, 16)
    );
  }
}