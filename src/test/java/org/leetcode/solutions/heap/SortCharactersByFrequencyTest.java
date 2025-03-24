package org.leetcode.solutions.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SortCharactersByFrequencyTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String word, String expectedResult) {
    var solution = new SortCharactersByFrequency();
    var result = solution.frequencySort(word);
    assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of("tree", "eert"),
        Arguments.of("cccaaa", "aaaccc"),
        Arguments.of("Aabb", "bbAa")
    );
  }
}