package org.leetcode.solutions.hashtable;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindAllDuplicatesInAnArrayTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, List<Integer> expectedResult) {
    var solution = new FindAllDuplicatesInAnArray();
    var result = solution.findDuplicates(nums);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{4,3,2,7,8,2,3,1}, List.of(2,3)),
        Arguments.of(new int[]{1,1,2}, List.of(1)),
        Arguments.of(new int[]{1}, List.of(0))
    );
  }
}