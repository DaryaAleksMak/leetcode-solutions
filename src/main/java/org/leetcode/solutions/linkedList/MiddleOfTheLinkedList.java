package org.leetcode.solutions.linkedList;

public class MiddleOfTheLinkedList {
  public ListNode middleNode(ListNode head) {
    var next = head;
    int length = 0;
    while (next != null){
      next = next.next;
      length++;
    }

    int middleIndex = 0;
    if (length % 2 == 0){
      middleIndex = (length / 2);
    } else {
      middleIndex = length / 2;
    }

    var middle = head;
    while (middleIndex > 0){
      middle = middle.next;
      --middleIndex;
    }

    return middle;
  }
}
