package org.leetcode.solutions.Arrays_Hashing;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EncodeAndDecodeStringsTest {


  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(List<String> strs) {
    var solution = new EncodeAndDecodeStrings();
    var encodedStr = solution.encode(strs);
    var decodedStr = solution.decode(encodedStr);
    Assertions.assertTrue(true);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
//        Arguments.of(List.of("")),
        Arguments.of(List.of("we","say",":","yes","!@#$%^&*()")),
        Arguments.of(List.of("neet", "code", "love", "you"))
    )
        ;
  }

}