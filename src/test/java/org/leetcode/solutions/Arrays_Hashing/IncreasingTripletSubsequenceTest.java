package org.leetcode.solutions.Arrays_Hashing;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class IncreasingTripletSubsequenceTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] nums, boolean expectedResult) {
        var solution = new IncreasingTripletSubsequence();
        var result = solution.increasingTriplet(nums);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testCases() {

        return Stream.of(
                Arguments.of(new int[]{1,1,-2,6}, false),
                Arguments.of(new int[]{1,5,0,4,1,3}, true),
                Arguments.of(new int[]{1,2,1,3}, true),
                Arguments.of(new int[]{20,100,10,12,5,13}, true),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, true),
                Arguments.of(new int[]{5, 4, 3, 2, 1}, false),
                Arguments.of(new int[]{2, 1, 5, 0, 4, 6}, true),
                Arguments.of(new int[]{2, 1, 0, 1, 2, 3, 7, 8, 9}, true)
        );
    }

}