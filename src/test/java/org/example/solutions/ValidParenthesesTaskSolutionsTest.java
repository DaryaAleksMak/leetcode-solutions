package org.example.solutions;

import org.example.solutions.validParentheses.ValidParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidParenthesesTaskSolutionsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(String s, boolean expectedResult) {
        var task = new ValidParentheses();
        var result = task.solution(s);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testCases() {

        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("([{}])", true),
                Arguments.of("([{}]){}", true),
                Arguments.of("(", false),
                Arguments.of("]", false)
        );
    }

}