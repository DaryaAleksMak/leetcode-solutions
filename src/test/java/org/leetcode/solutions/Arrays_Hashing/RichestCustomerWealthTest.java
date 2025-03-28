package org.leetcode.solutions.Arrays_Hashing;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RichestCustomerWealthTest {
    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[][] account, int expectedResult) {
        var solution = new RichestCustomerWealth();
        var result = solution.maximumWealth(account);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testCases() {

        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {3, 2, 1}}, 6));
    }

}