package org.leetcode.solutions.stack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CrawlerLogFolderTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String[] logs, int expectedResult) {
    var solution = new CrawlerLogFolder();
    int result = solution.minOperations(logs);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new String[]{"d1/", "d2/", "../", "d21/", "./"}, 2),
        Arguments.of(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"}, 3),
        Arguments.of(new String[]{"d1/", "../", "../", "../"}, 0)
    );
  }
}