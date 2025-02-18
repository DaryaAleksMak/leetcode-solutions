package org.leetcode.solutions.strings;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ConvertDateToBinaryTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String date, String expectedResult) {
    var solution = new ConvertDateToBinary();
    var result = solution.convertDateToBinary(date);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of("2080-02-29", "100000100000-10-11101"),
        Arguments.of("1900-01-01", "11101101100-1-1"));
  }

}