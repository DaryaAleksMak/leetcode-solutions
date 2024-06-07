package org.example.solutions.Two_Pointers;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MaxWaterContainerTest {
    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int[] nums, int expectedResult) {
        var twoSumTaskSolutions = new MaxWaterContainer();
        int result = twoSumTaskSolutions.solution(nums);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 7, 2, 5, 4, 7, 3, 6}, 36),
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1)
        );
    }

}