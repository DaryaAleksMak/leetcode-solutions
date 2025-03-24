package org.leetcode.solutions.heap;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.leetcode.solutions.Arrays_Hashing.RichestCustomerWealth;

class DeleteGreatestValueInEachRowTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[][] account, int expectedResult) {
    var solution = new DeleteGreatestValueInEachRow();
    var result = solution.deleteGreatestValue(account);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new int[][]{{1,2,4},{3,3,1}}, 8));
  }

}