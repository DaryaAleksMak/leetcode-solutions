package org.leetcode.solutions.addTwoNumber;

public class AddTwoNumberTask {
    public ListNode solution(ListNode l1, ListNode l2) {
        var currentNode1 = l1;
        var currentNode2 = l2;
        var carry = 0;


        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (currentNode1 != null || currentNode2 != null || carry != 0) {
            var value1 = currentNode1 != null ? currentNode1.val : 0;
            var value2 = currentNode2 != null ? currentNode2.val : 0;
            int sum = value1 + value2 + carry;
            int resultSum = sum >= 10 ? sum - 10 : sum;
            carry = sum >= 10 ? 1 : 0;

            ListNode newNode = new ListNode(resultSum);
            tail.next = newNode;
            tail = tail.next;

            currentNode1 = currentNode1 != null ? currentNode1.next : null;
            currentNode2 = currentNode2 != null ? currentNode2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
}
//0) DH = {val = 0, next = null}, tail = GH = {val = 0, next = null}
//1) NN = {val 7, next = null},
//          row 61:  tail = {val = 0, next = {val = 7, next = null}},
//          row 62: tail = {val = 7, next = null}
// DH = {val = 0, next = {val = 7, next = null}}
//2) NN = {val 0, next = null},
//          row 61:  tail = {val = 0, next = {val = 0, next = null}},
//          row 62: tail = {val = 7, next = null}
// DH = {val = 0, next = {val = 7, next = null}}

//2 4 3
//5 6 4

//7 0 8

//new ListNode(8, ListNode(0, ListNode(7, null)))