package org.leetcode.solutions.binarySearch;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.leetcode.solutions.sorting.binarySearch.MagneticForceBetweenTwoBalls;

class MagneticForceBetweenTwoBallsTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] position, int balls, int expectedResult) {
    var sortedMatrix = new MagneticForceBetweenTwoBalls();
    var result = sortedMatrix.maxDistance(position, balls);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[]{1, 2, 3, 4, 7}, 3, 3),
        Arguments.of(new int[]{5, 4, 3, 2, 1, 1000000000}, 2, 999999999)
    );
  }
}