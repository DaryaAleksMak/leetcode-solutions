package org.example.solutions.Arrays_Hashing;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindStableMountainsTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] height, int threshold, Integer[] stableMountains) {
    var solution = new FindStableMountains();
    var result = solution.stableMountains(height, threshold);
    assertThat(stableMountains).containsOnly(result.toArray(new Integer[0]));
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{1,2,3,4,5}, 2, new Integer[]{3,4}),
        Arguments.of(new int[]{10,1,10,1,10}, 3, new Integer[]{1,3}),
        Arguments.of(new int[]{10,1,10,1,10}, 10, new Integer[]{})
    );
  }

}