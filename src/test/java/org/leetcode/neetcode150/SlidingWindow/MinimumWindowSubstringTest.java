package org.leetcode.neetcode150.SlidingWindow;

import java.util.LinkedHashMap;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MinimumWindowSubstringTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String s1, String s2, String expectedResult) {
    var solution = new MinimumWindowSubstring();
    var result = solution.minWindow(s1, s2);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of("ab", "b", "b"),
        Arguments.of("a", "a", "a"),
        Arguments.of("ADOBECODEBANC", "ABC", "BANC"),
        Arguments.of("AADOBECODEABANC", "AABC", "ABANC"),
        Arguments.of("a", "aa", "")
    );
  }
}