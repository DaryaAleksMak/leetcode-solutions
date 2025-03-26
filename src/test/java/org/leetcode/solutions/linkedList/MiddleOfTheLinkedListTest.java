package org.leetcode.solutions.linkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.solutions.heap.FindXSumOfAllKLongSubarraysI;

class MiddleOfTheLinkedListTest {

  @Test
  void testSolution() {
//    ListNode listNode = new ListNode(1,
//        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    ListNode listNode = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    var solution = new MiddleOfTheLinkedList();
    ListNode middleNode = solution.middleNode(listNode);
    Assertions.assertEquals(3, middleNode.val);
  }


}