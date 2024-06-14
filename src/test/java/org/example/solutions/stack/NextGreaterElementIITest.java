package org.example.solutions.stack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NextGreaterElementIITest {

    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int[] nums1, int[] expectedResult) {
        var twoSumTaskSolutions = new NextGreaterElementII();
        int[] result = twoSumTaskSolutions.nextGreaterElements(nums1);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1}, new int[]{2, -1, 2}),
                Arguments.of(new int[]{1, 2, 3, 4, 3}, new int[]{2, 3, 4, -1, 4})
        );
    }
}