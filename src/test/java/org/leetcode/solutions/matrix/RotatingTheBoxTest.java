package org.leetcode.solutions.matrix;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RotatingTheBoxTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(char[][] boxGrid, char[][] expectedResult) {
    var solution = new RotatingTheBox();
    var result = solution.rotateTheBox(boxGrid);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
//        Arguments.of(new char[][]{{'#', '.', '#'}}, new char[][]{{'.', '#', '#'}}),
//        Arguments.of(new char[][]{{'#', '.', '*', '.'}, {'#', '#', '*', '.'}},
//            new char[][]{{'#', '.'}, {'#', '#'}, {'*', '*'}, {'.', '.'}}),
        Arguments.of(new char[][]{{'#', '#', '*', '.', '*', '.'}, {'#', '#', '#', '*', '.', '.'},
                {'#', '#', '#', '.', '#', '.'}},
            new char[][]{{'.', '#', '#'}, {'.', '#', '#'}, {'#', '#', '*'}, {'#', '*', '.'},
                {'#', '.', '*'}, {'#', '.', '.'}})

    );
  }

}