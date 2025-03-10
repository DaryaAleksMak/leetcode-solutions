package org.leetcode.solutions.stack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ClearDigitsTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String s, String expectedResult) {
    var solution = new ClearDigits();
    String result = solution.clearDigits(s);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of("abc", "abc"),
        Arguments.of("cb34", "")
    );
  }
}