package org.example.solutions.sorting;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SortThePeopleTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String[] names, int[] heights, String[] expectedResult) {
    var solution = new SortThePeople();
    var result = solution.sortPeople(names, heights);
    Assertions.assertArrayEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170},
            new String[]{"Mary", "Emma", "John"}),
        Arguments.of(new String[]{"Alice","Bob","Bob"}, new int[]{155,185,150},
            new String[]{"Bob","Alice","Bob"})
    );
  }

}