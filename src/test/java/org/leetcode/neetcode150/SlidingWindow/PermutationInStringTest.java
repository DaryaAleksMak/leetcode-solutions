package org.leetcode.neetcode150.SlidingWindow;

import java.util.LinkedHashMap;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PermutationInStringTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String s1, String s2, boolean expectedResult) {
    LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

    var solution = new PermutationInString();
    var result = solution.checkInclusion(s1, s2);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of("adc", "dcda", true),
        Arguments.of("ab", "ab", true),
        Arguments.of("hello", "ooolleoooleh", false),
        Arguments.of("ab", "eidboaoo", false),
        Arguments.of("ab", "eidbaooo", true)
    );
  }
}