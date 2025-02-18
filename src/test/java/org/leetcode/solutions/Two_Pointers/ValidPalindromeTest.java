package org.leetcode.solutions.Two_Pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidPalindromeTest {
    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(String input, boolean expectedResult) {
        var solution = new ValidPalindrome();
        var result = solution.isPalindrome(input);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testCases() {

        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of(" ", true),
                Arguments.of("0P", false)
        );
    }

}