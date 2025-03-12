package org.leetcode.solutions.stack;

import java.util.Arrays;

/**
 * Your CustomStack object will be instantiated and called as such: CustomStack obj = new
 * CustomStack(maxSize); obj.push(x); int param_2 = obj.pop(); obj.increment(k,val);
 */
public class DesignStackWithIncrementOperation {

  private int[] stack = null;
  private int topIndex = -1;
  private int maxSize;
  private int usedSlots;

  public DesignStackWithIncrementOperation(int maxSize) {
    this.stack = new int[0];
    this.usedSlots = 0;
    this.maxSize = maxSize;
  }

  //Adds x to the top of the stack if the stack has not reached the maxSize.
  public void push(int x) {
    if (usedSlots < maxSize) {
      stack = Arrays.copyOf(stack, stack.length + 1);
      stack[++topIndex] = x;
      usedSlots++;
    }
  }

  // Pops and returns the top of the stack or -1 if the stack is empty.
  public int pop() {
    if (stack.length == 0) {
      return -1;
    } else {
      int removedTop = stack[topIndex--];
      stack = Arrays.copyOf(stack, stack.length - 1);
      usedSlots--;
      return removedTop;
    }

  }

  public void increment(int k, int val) {
    if (stack.length < k) {
      k = stack.length;
    }

    for (int i = 0; i < k; i++) {
      stack[i] = stack[i] + val;
    }

  }
}

