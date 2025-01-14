package org.example.solutions.stack;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CarFleetIITest {
    @ParameterizedTest
    @MethodSource("twoSumTestCases")
    void testSolution(int[][] cars, double[] expectedResult) {
        var carFleet = new CarFleetII();
        double[] result = carFleet.getCollisionTimes(cars);
        Assertions.assertArrayEquals(expectedResult, result);
    }

    public static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
//                Arguments.of(new int[][]{{1, 2}, {2, 1}, {4, 3}, {7, 2}}, new double[]{1.00000, -1.00000, 3.00000, -1.00000}),
//                Arguments.of(new int[][]{{5,1},{8,4},{12,5},{13,1},{16,2},{17,3},{18,1},{19,3}}, new double[]{-1.00000,1.66667,0.25000,-1.00000,2.00000,0.50000,-1.00000,-1.00000}),
//                Arguments.of(new int[][]{{1,3},{4,1},{7,3},{10,5},{11,2},{13,5},{17,4},{20,1}}, new double[]{1.50000,-1.00000,4.00000,0.33333,9.00000,1.75000,1.00000,-1.00000}),
                Arguments.of(new int[][]{{3, 4}, {5, 4}, {6, 3}, {9, 1}}, new double[]{2.00000, 1.00000, 1.50000, -1.00000}));
    }

}