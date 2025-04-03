package org.leetcode.demoTask.stringBuilder;

public class StringBuilderExample {

  public static void main(String[] args) {
    String string = "Hello Word";
    String[] split = string.split(" ");
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < split.length; i++) {
      builder.append(split[i]).append(" ");
    }
    builder.reverse();
    System.out.println(builder.toString());
  }

}
