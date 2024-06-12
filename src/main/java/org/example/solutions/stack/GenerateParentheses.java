package org.example.solutions.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        var list = new ArrayList<String>();
        addParentheses(list, "", 0, 0, n);
        return list;

    }

    private void addParentheses(List<String> list, String string, int open, int close, int max) {
        if (string.length() == max * 2) {
            list.add(string);
            return;
        }
        if (open < max) {
            addParentheses(list, string + "(", open + 1, close, max);
        }
        if (close < open) {
            addParentheses(list, string + ")", open, close + 1, max);
        }
    }
}
