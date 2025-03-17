package org.leetcode.solutions.Arrays_Hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidAnagramTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] nums,int k, int[] expectedResult) {
        var solution = new TopFrequentElements();
        var result = solution.topKFrequentBrute(nums, k);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testCases() {

        return Stream.of(
                Arguments.of(new int[]{1,1,1,2,2,3}, 2, new int[]{1,2})
        );
    }

}