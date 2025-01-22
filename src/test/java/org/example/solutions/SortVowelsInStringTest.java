package org.example.solutions;

import java.util.stream.Stream;
import org.example.solutions.strings.SortVowelsInString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SortVowelsInStringTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String input, String expectedResult) {
    var task = new SortVowelsInString();
    String result = task.sortVowels(input);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of("lEetcOde", "lEOtcede"),
        Arguments.of("lYmpH", "lYmpH")
    );
  }

}