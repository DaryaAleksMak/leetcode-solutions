package org.leetcode.solutions;

import org.leetcode.solutions.majorityElement.MajorityElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MajorityElementTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(int[] nums, int expectedResult) {
        var twoSumTaskSolutions = new MajorityElement();
        var result = twoSumTaskSolutions.solution(nums);
        Assertions.assertEquals(expectedResult,result);
    }

    public static Stream<Arguments> testCases() {

        return Stream.of(
                Arguments.of(new int[]{3,2,3}, 3),
                Arguments.of(new int[]{2,2,1,1,1,2,2}, 2)
        );
    }
}
