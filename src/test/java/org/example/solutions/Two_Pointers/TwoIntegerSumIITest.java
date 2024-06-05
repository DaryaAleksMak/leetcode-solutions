package org.example.solutions.Two_Pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoIntegerSumIITest {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int[] nums, int target, int[] expectedResult) {
        var twoSumTaskSolutions = new TwoIntegerSumII();
        int[] result = twoSumTaskSolutions.solution(nums, target);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{5,25,75}, 100, new int[]{2,3}),
                Arguments.of(new int[]{1,2,3,4}, 3, new int[]{1,2}),
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{1, 2}),
                Arguments.of(new int[]{2,3,4}, 6, new int[]{1,3}),
                Arguments.of(new int[]{-1,0}, -1, new int[]{1,2})
        );
    }

}