package org.leetcode.demoTask.lambda;

public class LambdaExample {

  public static void main(String[] args) {

    // Implementing the lambda expression
    MultipleLambda multiply = (a, b) -> a * b;

    // Testing the lambda
    System.out.println("Product: " + multiply.product(5, 6)); // Output: 30
  }

}
