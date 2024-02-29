package org.example.solutions;

import org.example.solutions.mergeSortedArray.MergedSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MergedSortedArrayTest {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int[] nums1, int m, int[] nums2, int n, int[] expectedResult) {
        var solution = new MergedSortedArray();
        int[] result = solution.solution(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1,2,2,3,5,6})
        );
    }
}
