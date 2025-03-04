package org.leetcode.solutions.hashtable;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindMaximumNumberOfStringPairsTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String[] stgs, int expectedResult) {
    var task = new FindMaximumNumberOfStringPairs();
    int result = task.maximumNumberOfStringPairs(stgs);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new String[]{"cd", "ac", "dc", "ca", "zz"}, 2),
        Arguments.of(new String[]{"ab", "ba", "cc"}, 1)
    );
  }
}