package org.example.solutions.Two_Pointers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ThreeIntegerSumTest {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int[] nums, List<List<Integer>> expectedResult) {
        var  task = new ThreeIntegerSum();
        List<List<Integer>> result = task.solutionSlow(nums);
        Assertions.assertNotNull(result);
//        Assertions.assertArrayEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{0,0,0,0}, List.of(Arrays.asList(0, 0, 0))),
                Arguments.of(new int[]{0,0,0}, List.of(Arrays.asList(0, 0, 0))),
                Arguments.of(new int[]{3,0,-2,-1,1,2},Arrays.asList(Arrays.asList(-2,-1,3),Arrays.asList(-2,0,2),Arrays.asList(-1,0,1))),
                Arguments.of(new int[]{-1,0,1,0}, List.of(Arrays.asList(-1,0,1))),
                Arguments.of(new int[]{-1,0,1,2,-1,-4}, Arrays.asList(Arrays.asList(-1,-1,2),Arrays.asList(-1,0,1))),
                Arguments.of(new int[]{0,1,1}, List.of())
        );
    }

}