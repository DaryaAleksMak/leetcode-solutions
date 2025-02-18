package org.leetcode.solutions;

import org.leetcode.solutions.addTwoNumber.AddTwoNumberTask;
import org.leetcode.solutions.addTwoNumber.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class AddTwoNumbersTaskSolutionsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void testSolution(ListNode l1, ListNode l2, ListNode expectedResult) {
        var twoSumTaskSolutions = new AddTwoNumberTask();
        var result = twoSumTaskSolutions.solution(l1, l2);
        Assertions.assertNotNull(result);
    }

    public static Stream<Arguments> testCases() {

        return Stream.of(
                Arguments.of(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(4))), new ListNode(7, new ListNode(0, new ListNode(8))))
//                Arguments.of(new int[]{2, 5, 5, 11}, 10, new int[]{1, 2})
        );
    }

}