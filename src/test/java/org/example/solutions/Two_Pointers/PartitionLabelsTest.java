package org.example.solutions.Two_Pointers;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PartitionLabelsTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String inputString, List<Integer> expectedResult) {
    var twoSumTaskSolutions = new PartitionLabels();
    var result = twoSumTaskSolutions.partitionLabels(inputString);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of("eaaaabaaec", List.of(9, 1)),
        Arguments.of("ababcbacadefegdehijhklij", List.of(9, 7, 8)),
        Arguments.of("eccbbbbdec", List.of(10))
    );
  }
}