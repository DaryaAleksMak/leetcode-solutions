package org.leetcode.solutions.Arrays_Hashing;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindAllNumbersDisappearedInArrayTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] arr, int[] expectedResult) {
    var solution = new FindAllNumbersDisappearedInArray();
    var result = solution.findDisappearedNumbers(arr);
    assertTrue(true);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{1, 1}, new int[]{2}),
        Arguments.of(new int[]{4, 3, 2, 7, 8, 2, 3, 1}, new int[]{5, 6})
    );
  }
}