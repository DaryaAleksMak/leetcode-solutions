package org.leetcode.neetcode150.SlidingWindow;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestSubstringWithoutRepeatingCharactersTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String s, int expectedResult) {
    var solution = new LongestSubstringWithoutRepeatingCharacters();
    var result = solution.lengthOfLongestSubstring(s);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of("dvdf", 3),
        Arguments.of(" ", 1),
        Arguments.of("abcabcbb", 3),
        Arguments.of("bbbbb", 1),
        Arguments.of("pwwkew", 3)
    );
  }
}