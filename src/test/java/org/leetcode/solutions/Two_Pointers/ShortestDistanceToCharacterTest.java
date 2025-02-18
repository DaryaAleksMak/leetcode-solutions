package org.leetcode.solutions.Two_Pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ShortestDistanceToCharacterTest {

  @ParameterizedTest
  @MethodSource("twoSumTestCases")
  void testSolution(String inputString, char c, int[] expectedResult) {
    var twoSumTaskSolutions = new ShortestDistanceToCharacter();
    var result = twoSumTaskSolutions.shortestToChar(inputString, c);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> twoSumTestCases() {
    return Stream.of(
        Arguments.of("loveleetcode", 'e', new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}),
        Arguments.of("aaab", 'b', new int[]{3, 2, 1, 0})
    );
  }
}