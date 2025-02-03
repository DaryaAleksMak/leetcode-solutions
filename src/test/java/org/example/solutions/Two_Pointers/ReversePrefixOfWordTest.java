package org.example.solutions.Two_Pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReversePrefixOfWordTest {

  @ParameterizedTest
  @MethodSource("twoSumTestCases")
  void testSolution(String inputString, char ch, String expectedResult) {
    var twoSumTaskSolutions = new ReversePrefixOfWord();
    var result = twoSumTaskSolutions.reversePrefix(inputString, ch);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> twoSumTestCases() {
    return Stream.of(
        Arguments.of("abcdefd", 'd', "dcbaefd"),
        Arguments.of("xyxzxe", 'z', "zxyxxe"),
        Arguments.of("abcd", 'z', "abcd")
    );
  }
}