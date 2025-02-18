package org.leetcode.solutions.Arrays_Hashing;

import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean isValid = true;
        for (int i = 0; i < board.length; i++) {
            var treeSet = new HashSet<Integer>();
            var count = 0;
            for (int j = 0; j < board.length; j++) {
                char c = board[i][j];
                if (Character.isDigit(c)) {
                    ++count;
                    treeSet.add(Character.getNumericValue(c));
                }
            }
            if (treeSet.size() != count) {
                isValid = false;
                break;
            }
        }

        if (!isValid) return isValid;

        for (int i = 0; i < board.length; i++) {
            var treeSet = new HashSet<Integer>();
            var count = 0;
            for (int j = 0; j < board.length; j++) {
                char c = board[j][i];
                if (Character.isDigit(c)) {
                    ++count;
                    treeSet.add(Character.getNumericValue(c));
                }
            }
            if (treeSet.size() != count) {
                isValid = false;
                break;
            }
        }

        if (!isValid) return isValid;

        for (int i = 0; i < board.length; i = i + 3) {
            for (int j = 0;  j < board.length; j = j + 3) {
                if (!boxIsValid(i, j, board)) {
                    isValid = false;
                    break;
                }
            }
        }

        return isValid;
    }

    private boolean boxIsValid(int iInput, int jInput, char[][] board) {
        var treeSet = new HashSet<Integer>();
        var count = 0;
        for (int i = iInput; i < iInput + 3; i++) {
            for (int j = jInput; j < jInput + 3; j++) {
                char c = board[i][j];
                if (Character.isDigit(c)) {
                    ++count;
                    var digit = Character.getNumericValue(c);
                    treeSet.add(digit);
                }
            }
        }
        if (treeSet.size() != count) {
            return false;
        }
        return true;
    }
}
