package org.example.solutions;

import org.example.solutions.twosum.TwoSumTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TwoSumTaskSolutionsTest {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int[] nums, int target, int[] expectedResult) {
        var twoSumTaskSolutions = new TwoSumTask();
        int[] result = twoSumTaskSolutions.solution(nums, target);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{2, 5, 5, 11}, 10, new int[]{1, 2})
        );
    }

}