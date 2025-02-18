package org.leetcode.solutions.Two_Pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LexicographicallySmallestPalindromeTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String inputString, String expectedResult) {
    var twoSumTaskSolutions = new LexicographicallySmallestPalindrome();
    var result = twoSumTaskSolutions.makeSmallestPalindrome(inputString);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of("egcfe",  "efcfe"),
        Arguments.of("abcd",  "abba"),
        Arguments.of("seven",  "neven")
    );
  }
}