package org.example.solutions.stack;

import org.junit.jupiter.api.Test;

class MinStackTest {

    @Test
    void testSolution() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        int min = minStack.getMin();
        minStack.pop();
        minStack.top();
        int minStackMin = minStack.getMin();
        System.out.println();
    }

    @Test
    void testSolution2() {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);

        int min = minStack.getMin();
        System.out.println(min);
        minStack.pop();
        int minStackMin = minStack.getMin();
        System.out.println();
    }

    @Test
    void testSolution3() {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);

        int min = minStack.getMin();
        System.out.println(min);

        minStack.pop();
        min = minStack.getMin();
        System.out.println(min);

        minStack.pop();
        min = minStack.getMin();
        System.out.println(min);

        minStack.pop();
        min = minStack.getMin();
        System.out.println(min);

    }

}