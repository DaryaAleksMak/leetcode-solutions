package org.leetcode.neetcode150.SlidingWindow;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaximumLengthSubstringWithTwoOccurrencesTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String s1,  Integer expectedResult) {
    var solution = new MaximumLengthSubstringWithTwoOccurrences();
    var result = solution.maximumLengthSubstring(s1);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
//        Arguments.of("bcbbbcba", 4),
        Arguments.of("aacc", 3)
    );
  }
}