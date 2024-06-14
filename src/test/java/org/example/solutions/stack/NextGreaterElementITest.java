package org.example.solutions.stack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NextGreaterElementITest {


    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int[] nums1, int[] nums2, int[] expectedResult) {
        var twoSumTaskSolutions = new NextGreaterElementI();
        int[] result = twoSumTaskSolutions.nextGreaterElement(nums1, nums2);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}, new int[]{-1, 3, -1}),
                Arguments.of(new int[]{2, 4}, new int[]{1, 2, 3, 4}, new int[]{3, -1}),
                Arguments.of(new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7}, new int[]{7, 7, 7, 7, 7})
        );
    }

}