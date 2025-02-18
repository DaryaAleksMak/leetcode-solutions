package org.leetcode.solutions;

import org.leetcode.solutions.removeDuplicatesfromSortedArray.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class RemoveDuplicatesFromSortedArrayTest {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int[] nums, int[] resultNums) {
        var solution = new RemoveDuplicatesFromSortedArray();
        int result = solution.removeDuplicates(nums);
        assert result == resultNums.length;
        for (int i = 0; i < result; i++) {
            assert nums[i] == resultNums[i];
        }
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, new int[]{1,2}),
                Arguments.of(new int[]{1, 1}, new int[]{1}),
                Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4})
        );
    }
}
