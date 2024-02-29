package org.example.solutions;

import org.example.solutions.romanToInteger.RomanToIntegerSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RomanToIntegerTest {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(String romanInt, int expectedResult) {
        var task = new RomanToIntegerSolution();
        int result = task.solution(romanInt);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }

}