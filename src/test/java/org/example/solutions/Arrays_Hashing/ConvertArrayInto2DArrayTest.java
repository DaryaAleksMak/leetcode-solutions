package org.example.solutions.Arrays_Hashing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ConvertArrayInto2DArrayTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, List<List<Integer>> expectedResult) {
    var solution = new ConvertArrayInto2DArray();
    var result = solution.findMatrix(nums);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[]{1, 3, 4, 1, 2, 3, 1}, Arrays.asList(
            Arrays.asList(1, 3, 4, 2),
            Arrays.asList(1, 3),
            Arrays.asList(1)))
    );
  }

}