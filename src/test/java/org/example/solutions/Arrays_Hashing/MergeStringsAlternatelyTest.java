package org.example.solutions.Arrays_Hashing;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MergeStringsAlternatelyTest {
    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(String word1, String word2, String expectedResult) {
        var solution = new MergeStringsAlternately();
        var result = solution.mergeAlternately(word1, word2);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testCases() {

        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("abcd", "pq", "apbqcd"),
                Arguments.of("ab", "pqrs", "apbqrs"));
    }
}