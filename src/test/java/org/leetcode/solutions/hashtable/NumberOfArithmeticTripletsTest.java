package org.leetcode.solutions.hashtable;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NumberOfArithmeticTripletsTest {


  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int diff, int expectedResult) {
    var solution = new NumberOfArithmeticTriplets();
    var result = solution.arithmeticTriplets(nums, diff);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{0, 1, 4, 6, 7, 10}, 3, 2),
        Arguments.of(new int[]{4, 5, 6, 7, 8, 9}, 2, 2)
    );
  }
}