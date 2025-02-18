package org.leetcode.solutions.Two_Pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DIStringMatchTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String inputString, int[] expectedResult) {
    var twoSumTaskSolutions = new DIStringMatch();
    var result = twoSumTaskSolutions.diStringMatch(inputString);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of("IDID", new int[]{0, 4, 1, 3, 2}),
        Arguments.of("III", new int[]{0, 1, 2, 3}),
        Arguments.of("DDI", new int[]{3, 2, 0, 1})
    );
  }
}