package org.leetcode.solutions.Arrays_Hashing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ProductsOfArrayExceptSelf2Test {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int[] expectedResult) {
    var solution = new ProductsOfArrayExceptSelf2();
    var result = solution.productExceptSelf(nums);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}),
        Arguments.of(new int[]{-1,1,0,-3,3}, new int[]{0,0,9,0,0}),
        Arguments.of(new int[]{0,0}, new int[]{0,0})
    );
  }
}