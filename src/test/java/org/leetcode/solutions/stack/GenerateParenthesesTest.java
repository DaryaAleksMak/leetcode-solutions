package org.leetcode.solutions.stack;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GenerateParenthesesTest {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int n, List<String> expectedResult) {
        var task = new GenerateParentheses();
        List<String> result = task.generateParenthesis(n);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(3, List.of("((()))","(()())","(())()","()(())","()()()")),
                Arguments.of(1, List.of("()"))
        );
    }
}