package org.leetcode.solutions.Arrays_Hashing;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountSpecialQuadrupletsTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int expectedResult) {
    var solution = new CountSpecialQuadruplets();
    var result = solution.countQuadruplets(nums);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
//        Arguments.of(new int[]{1, 2, 3, 6}, 1),
//        Arguments.of(new int[]{3, 3, 6, 4, 5}, 0),
        Arguments.of(new int[]{1, 1, 1, 3, 5}, 4)
    );
  }
}