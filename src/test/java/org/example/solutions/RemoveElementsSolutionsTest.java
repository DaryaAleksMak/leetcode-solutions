package org.example.solutions;

import org.example.solutions.twosum.TwoSumTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

class RemoveElementsSolutionsTest {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int[] nums, int val, int k, int[] resultNums) {
        var solution = new RemoveElement();
        int result = solution.removeElement(nums, val);
        Assertions.assertEquals(k, result);
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i < result; i++) {
            assert sortedNums[i] == resultNums[i];
        }
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{3,2,2,3}, 3, 2, new int[]{2,2}),
                Arguments.of(new int[]{0,1,2,2,3,0,4,2}, 2, 5, new int[]{0,0,1,3,4})
        );
    }

}