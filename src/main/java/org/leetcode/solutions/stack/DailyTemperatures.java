package org.leetcode.solutions.stack;

import java.util.Stack;

public class DailyTemperatures {

    // O(n*n)
    public int[] dailyTemperaturesSlowSolution(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            result[i] = 0;
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        var result = new int[temperatures.length];
        var stack = new Stack<int[]>();
        for (int i = 0; i < temperatures.length; i++) {
            var temperature = temperatures[i];
            if (stack.isEmpty() || temperature < stack.peek()[1]) {
                var pair = new int[2];
                pair[0] = i;
                pair[1] = temperature;
                stack.push(pair);
                continue;
            }

            while (true) {
                var pair = new int[2];
                pair[0] = i;
                pair[1] = temperature;
                if (stack.isEmpty()) {
                    stack.push(pair);
                    break;
                }
                var head = stack.peek();
                var index = head[0];
                var value = head[1];
                if (temperature > value) {
                    stack.pop();
                    result[index] = i - index;
                } else {
                    stack.push(pair);
                    break;
                }
            }
        }

        return result;
    }
}
