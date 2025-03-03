package org.leetcode.solutions.hashtable;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSneakyNumbersOfDigitvilleTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int[] expectedResult) {
    var solution = new TwoSneakyNumbersOfDigitville();
    var result = solution.getSneakyNumbers(nums);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{0, 1, 1, 0}, new int[]{0, 1}),
        Arguments.of(new int[]{0, 3, 2, 1, 3, 2}, new int[]{2, 3}),
        Arguments.of(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2}, new int[]{4, 5})
    );
  }

}