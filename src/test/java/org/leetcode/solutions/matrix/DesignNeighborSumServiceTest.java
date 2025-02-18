package org.leetcode.solutions.matrix;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DesignNeighborSumServiceTest {
  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(List<String> commands, int[][]grid, List<Integer> values) {
    NeighborSum neighborSum = new NeighborSum(grid);
    for (int i = 0; i < commands.size(); i++) {
      Integer sum = switch (commands.get(i)){
        case "adjacentSum" -> neighborSum.adjacentSum(values.get(i));
        case "diagonalSum" -> neighborSum.diagonalSum(values.get(i));
        default -> null;
      };
    }
    Assertions.assertTrue(true);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(List.of("NeighborSum", "adjacentSum", "adjacentSum", "diagonalSum", "diagonalSum"),
            new int[][]{{0,1,2}, {3,4,5}, {6,7,8}}, List.of(1,4,4,8)));

  }

}