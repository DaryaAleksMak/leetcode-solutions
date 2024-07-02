package org.example.solutions.Two_Pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReverseWordsInAStringTest {
    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(String inputString, String expectedResult) {
        var twoSumTaskSolutions = new  ReverseWordsInAString();
        var result = twoSumTaskSolutions.reverseWords(inputString);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of("the sky is blue", "blue is sky the"),
                Arguments.of("  hello world  ", "world hello"),
                Arguments.of("a good   example", "example good a")
        );
    }

}