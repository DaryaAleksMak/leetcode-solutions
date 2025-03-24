package org.leetcode.neetcode150.SlidingWindow;


import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BestTimeToBuyAndSellStockTest {
  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(int[] nums, int expectedResult) {
    var solution = new BestTimeToBuyAndSellStock();
    var result = solution.maxProfit(nums);
    Assertions.assertEquals(expectedResult,result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
//        Arguments.of(new int[]{1,4,1,4,3,1}, 3),
        Arguments.of(new int[]{2,11,1,4,7}, 9),
        Arguments.of(new int[]{7,1,5,3,6,4}, 5),
        Arguments.of(new int[]{7,6,4,3,1}, 0),
        Arguments.of(new int[]{2,4,1}, 2),
        Arguments.of(new int[]{2,1,2,1,0,1,2}, 2),
        Arguments.of(new int[]{2,7,1,4}, 5)
    );
  }

}