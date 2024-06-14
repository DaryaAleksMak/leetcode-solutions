package org.example.solutions.stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        var map = new HashMap<Integer, Integer>();
        var stack = new Stack<Integer>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int i1 = nums2[i];

            if (stack.empty()) {
                stack.push(i1);
                map.put(i1, -1);
                continue;
            }

            if (i1 < stack.peek()) {
                map.put(i1, stack.peek());
                stack.push(i1);
                continue;
            }

            while (true) {
                if (stack.empty()) {
                    stack.push(i1);
                    map.put(i1, -1);
                    break;
                }
                if (i1 < stack.peek()) {
                    map.put(i1, stack.peek());
                    stack.push(i1);
                    break;
                } else {
                    stack.pop();
                }
            }
        }


        var result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}

