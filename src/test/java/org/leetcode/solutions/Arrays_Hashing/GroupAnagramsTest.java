package org.leetcode.solutions.Arrays_Hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class GroupAnagramsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(String[] strs, List<List<String>> expectedResult) {
        var solution = new GroupAnagrams();
        var result = solution.groupAnagrams(strs);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testCases() {

        return Stream.of(
                Arguments.of(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}, Arrays.asList(
                        Arrays.asList("bat"),
                        Arrays.asList("nat", "tan"),
                        Arrays.asList("ate", "eat", "tea")))
        );
    }
}

