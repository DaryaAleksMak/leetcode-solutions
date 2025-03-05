package org.leetcode.solutions.hashtable;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindTheNumberOfGoodPairsITest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums1, int[] nums2, int k, int expectedResult) {
    var solution = new FindTheNumberOfGoodPairsI();
    var result = solution.numberOfPairs(nums1, nums2, k);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{1, 3, 4}, new int[]{1, 3, 4}, 1, 5),
        Arguments.of(new int[]{1,2,4,12}, new int[]{2,4}, 3, 2)
        );
  }
}