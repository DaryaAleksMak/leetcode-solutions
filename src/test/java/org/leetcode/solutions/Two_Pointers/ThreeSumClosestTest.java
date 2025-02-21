package org.leetcode.solutions.Two_Pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ThreeSumClosestTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int target, int expectedResult) {
    var twoSumTaskSolutions = new ThreeSumClosest();
    int result = twoSumTaskSolutions.threeSumClosest(nums, target);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[]{1,3,4,7,8,9}, 15, 15),
        Arguments.of(new int[]{-4,2,2,3,3,3}, 0, 0),
        Arguments.of(new int[]{2, 5, 6, 7}, 16, 15),
        Arguments.of(new int[]{1,1,1,0}, -100, 2),
        Arguments.of(new int[]{10,20,30,40,50,60,70,80,90}, 1, 60),
        Arguments.of(new int[]{-1, 2, 1, -4}, 1, 2),
        Arguments.of(new int[]{-1, 2, 1, -4}, 1, 2)
    );
  }
}