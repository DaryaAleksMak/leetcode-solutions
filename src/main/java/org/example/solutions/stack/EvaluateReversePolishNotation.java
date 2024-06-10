package org.example.solutions.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        var stack = new Stack<Integer>();
        for (String token : tokens) {
            switch (token) {
                case "+": {
                    var top = stack.pop();
                    var lastAfterTop = stack.pop();
                    stack.push(lastAfterTop + top);
                    break;
                }
                case "-": {
                    var top = stack.pop();
                    var lastAfterTop = stack.pop();
                    stack.push(lastAfterTop - top);
                    break;
                }
                case "*": {
                    var top = stack.pop();
                    var lastAfterTop = stack.pop();
                    stack.push(lastAfterTop * top);
                    break;
                }
                case "/": {
                    var top = stack.pop();
                    var lastAfterTop = stack.pop();
                    stack.push(lastAfterTop / top);
                    break;
                }
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }

}
