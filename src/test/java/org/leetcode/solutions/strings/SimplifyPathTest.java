package org.leetcode.solutions.strings;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SimplifyPathTest {

  /**
   * * Input: path = "/home/" Output: "/home" * <p> * Input: path = "/home//foo/" Output:
   * "/home/foo" * <p> * Input: path = "/home/user/Documents/../Pictures" Output:
   * "/home/user/Pictures" * <p> * Input: path = "/../" Output: "/" * <p> * Input: path =
   * "/.../a/../b/c/../d/./" Output: "/.../b/d"
   */
  @ParameterizedTest
  @MethodSource("testCases")
  void testSolution(String path, String expectedResult) {
    var solution = new SimplifyPath();
    var result = solution.simplifyPath(path);
    Assertions.assertEquals(expectedResult, result);
  }

  public static Stream<Arguments> testCases() {

    return Stream.of(
//        Arguments.of("/home/", "/home"),
//        Arguments.of("/home//foo/", "/home/foo"),
//        Arguments.of("/../", "/"),
//        Arguments.of("/.../a/../b/c/../d/./", "/.../b/d"),
//        Arguments.of("/home/user/Documents/../Pictures", "/home/user/Pictures"),
        Arguments.of("/a//b////c/d//././/..", "/a/b/c"),
        Arguments.of("/a/./b/../../c/", "/c"));
  }
}