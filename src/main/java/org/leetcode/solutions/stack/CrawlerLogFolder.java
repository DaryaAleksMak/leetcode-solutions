package org.leetcode.solutions.stack;

import java.util.Stack;

public class CrawlerLogFolder {

  //@formatter:off
  /**
   * "d1/","d2/","../","d21/","./"
   *
   * patterns:
   * "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
   * "./" : Remain in the same folder.
   * "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
   *
   * stack:
   * if log == "../" -> if (stack is empty) do nothing else stack.pop()
   * if log == "./" ->  do nothing
   * else stack.push(log)
   *
   * "d1/" -> stack ["d1/"]
   * "d2/" -> stack ["d1/", "d2/"]
   * "../" -> stack ["d1/"]
   * "d21/" -> stack ["d1/", "d21/"]
   * "./" -> stack ["d1/", "d21/"]
   *
   * return stack.size
   *
   * "d1/", "d2/", "./", "d3/", "../", "d31/"
   * "d1/" -> stack["d1/"]
   * "d2/" -> stack["d1/", "d2/"]
   * "./" -> stack["d1/", "d2/"]
   * "d3/" -> stack["d1/", "d2/", "d3/"]
   * "../" -> stack["d1/", "d2/"]
   * "d31/" -> stack["d1/", "d2/", "d31/"]
   *
   */
  //@formatter:on

  public int minOperations(String[] logs) {

    Stack<String> stack = new Stack<>();

    for(String log : logs) {
      if (log.equals("../")){
        if (!stack.isEmpty()) {
          stack.pop();
        }
      }else if (log.equals("./") ){
        continue;
      }else {
        stack.push(log);
      }
    }
    return stack.size();
  }
}
