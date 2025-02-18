package org.leetcode.solutions.strings;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GenerateBinaryStringsWithoutAdjacentZerosTest {

  @ParameterizedTest
  @MethodSource("twoSumTestCases")
  void testSolution(int n, List<String> expectedResult) {
    var  task = new GenerateBinaryStringsWithoutAdjacentZeros();
    List<String> result = task.validStrings(n);
    Assertions.assertNotNull(result);
//        Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> twoSumTestCases() {
    return Stream.of(
        Arguments.of(3, List.of("010","011","101","110","111")),
        Arguments.of(1, List.of("0","1")));
  }

}