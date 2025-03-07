package org.leetcode.solutions.Arrays_Hashing;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountTripletsThatCanFormTwoArraysOfEqualXORTest {
  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] arr, int expectedResult) {
    var solution = new CountTripletsThatCanFormTwoArraysOfEqualXOR();
    var result = solution.countTriplets(arr);
    assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{2,3,1,6,7}, 4),
        Arguments.of(new int[]{1,1,1,1,1}, 10)
    );
  }
}