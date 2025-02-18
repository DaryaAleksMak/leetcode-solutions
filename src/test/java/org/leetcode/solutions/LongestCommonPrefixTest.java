package org.leetcode.solutions;

import org.leetcode.solutions.longestCommonPrefix.LongestCommonPrefix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LongestCommonPrefixTest {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(String[] stgs, String expectedResult) {
        var task = new LongestCommonPrefix();
        String result = task.solution(stgs);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"} , "fl"),
                Arguments.of(new String[]{"dog","racecar","car"}, ""),
                Arguments.of(new String[]{"ab","a"}, "a")
        );
    }

}