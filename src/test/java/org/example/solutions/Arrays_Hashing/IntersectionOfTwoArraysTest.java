package org.example.solutions.Arrays_Hashing;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class IntersectionOfTwoArraysTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums1, int[] nums2, int[] expectedResult) {
    var solution = new IntersectionOfTwoArrays();
    var result = solution.intersection(nums1, nums2);
    assertThat(expectedResult).containsOnly(result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{1, 2, 2, 1}, new int[]{2, 2}, new int[]{2}),
        Arguments.of(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}, new int[]{9, 4})
        );
  }


}