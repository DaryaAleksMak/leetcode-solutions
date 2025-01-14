package org.example.solutions.Arrays_Hashing;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MissingNumberTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int expectedResult) {
    var solution = new MissingNumber();
    var result = solution.missingNumber(nums);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{3, 0, 1}, 2),
        Arguments.of(new int[]{0, 1}, 2),
        Arguments.of(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}, 8)
    );
  }

}