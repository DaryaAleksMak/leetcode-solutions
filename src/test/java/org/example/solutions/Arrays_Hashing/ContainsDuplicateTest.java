package org.example.solutions.Arrays_Hashing;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ContainsDuplicateTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] nums, boolean expectedResult) {
        var solution = new ContainsDuplicate();
        var result = solution.containsDuplicate(nums);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testCases() {

        return Stream.of(
            Arguments.of(new int[]{1, 2, 3, 1}, true),
            Arguments.of(new int[]{1, 2, 3, 4}, false),
            Arguments.of(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true)
        );
    }

}