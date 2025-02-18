package org.leetcode.solutions;

import org.leetcode.solutions.palindromeNumber.PalindromeNumberTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PalindromeNumberTest {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int number, boolean expectedResult) {
        var task = new PalindromeNumberTask();
        boolean result = task.solution(number);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false)
        );
    }

}