package org.leetcode.solutions.stack;

import java.util.HashMap;
import java.util.LinkedList;

public class ValidParentheses {
    public boolean solution(String s) {
        var mapPairs = new HashMap<Character, Character>();
        mapPairs.put('{', '}');
        mapPairs.put('[', ']');
        mapPairs.put('(', ')');

        var isCorrect = true;
        var checkOnClosed = new LinkedList<>();
        for (char c : s.toCharArray()) {
            boolean isOpened = false;
            switch (c) {
                case '{', '[', '(': {
                    isOpened = true;
                    break;
                }
                case '}', ']', ')': {
                    isOpened = false;
                    break;
                }
                default:
                    isCorrect = false;
                    break;
            }

            if (isOpened) {
                checkOnClosed.addLast(c);
            } else if (!checkOnClosed.isEmpty() && c == mapPairs.get(checkOnClosed.getLast())) {
                checkOnClosed.removeLast();
            } else {
                isCorrect = false;
                break;
            }

        }
        return isCorrect && checkOnClosed.isEmpty();
    }
}
