package org.example.solutions.strings;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.example.solutions.Arrays_Hashing.MergeStringsAlternately;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindWordsContainingCharacterTest {

  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String[] words,   char x, int[] expectedResult) {
    var solution = new FindWordsContainingCharacter();
    var result = solution.findWordsContaining(words, x);
    Assertions.assertTrue(true);

  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
        Arguments.of(new String[]{"leet","code"}, "e",new int[]{0,2}),
        Arguments.of(new String[]{"abc","bcd","aaaa","cbc"}, "a", new int[]{0,2}),
        Arguments.of(new String[]{"abc","bcd","aaaa","cbc"},"z", new int[]{}));
  }

}