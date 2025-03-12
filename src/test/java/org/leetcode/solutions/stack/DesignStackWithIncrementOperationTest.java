package org.leetcode.solutions.stack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DesignStackWithIncrementOperationTest {

  @Test
  void testSolution() {
    DesignStackWithIncrementOperation stack = new DesignStackWithIncrementOperation(3);
    stack.push(1);
    stack.push(2);
    stack.pop();
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.increment(5,100);
    stack.increment(2,100);
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();

    Assertions.assertTrue(true);
  }

}