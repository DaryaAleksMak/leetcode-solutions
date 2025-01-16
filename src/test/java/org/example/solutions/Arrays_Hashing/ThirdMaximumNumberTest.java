package org.example.solutions.Arrays_Hashing;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ThirdMaximumNumberTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int expectedResult) {
    var solution = new ThirdMaximumNumber();
    var result = solution.thirdMax(nums);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{1,2147483647,-2147483648}, -2147483648),
        Arguments.of(new int[]{1, 2, 2, 5, 3, 5}, 2),
        Arguments.of(new int[]{1, 1, 2}, 2),
        Arguments.of(new int[]{3, 2, 1}, 1),
        Arguments.of(new int[]{1, 2}, 2),
        Arguments.of(new int[]{2, 2, 3, 1}, 1));
  }

}