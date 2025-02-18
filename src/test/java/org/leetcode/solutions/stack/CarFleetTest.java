package org.leetcode.solutions.stack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CarFleetTest {
    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int[] position, int[] speed, int target, int expectedResult) {
        var carFleet = new CarFleet();
        int result = carFleet.carFleet(target, position, speed);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3}, 12, 3),
                Arguments.of(new int[]{0,4,2}, new int[]{2,1,3}, 10, 1),
                Arguments.of(new int[]{6,8}, new int[]{3,2}, 10, 2)
        );
    }

}