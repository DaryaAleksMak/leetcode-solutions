package org.example.solutions.Arrays_Hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ValidSudokuTest {
    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(char[][] board, boolean expectedResult) {
        var solution = new ValidSudoku();
        var result = solution.isValidSudoku(board);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testCases() {

        return Stream.of(
                Arguments.of(new char[][]{
                        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                }, true),
                Arguments.of(new char[][]{
                        {'.', '.', '.', '9', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '3', '.', '.', '.', '.', '.', '1'},
                        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'1', '.', '.', '.', '.', '.', '3', '.', '.'},
                        {'.', '.', '.', '.', '2', '.', '6', '.', '.'},
                        {'.', '9', '.', '.', '.', '.', '.', '7', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'8', '.', '.', '8', '.', '.', '.', '.', '.'}
                }, false)
        );
    }

}