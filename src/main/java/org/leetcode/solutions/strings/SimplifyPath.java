package org.leetcode.solutions.strings;

import java.util.regex.Pattern;

/**
 * You are given an absolute path for a Unix-style file system, which always begins with a slash
 * '/'. Your task is to transform this absolute path into its simplified canonical path.
 * <p>
 * The rules of a Unix-style file system are as follows:
 * <p>
 * A single period '.' represents the current directory. A double period '..' represents the
 * previous/parent directory. Multiple consecutive slashes such as '//' and '///' are treated as a
 * single slash '/'. Any sequence of periods that does not match the rules above should be treated
 * as a valid directory or file name. For example, '...' and '....' are valid directory or file
 * names. The simplified canonical path should follow these rules:
 * <p>
 * The path must start with a single slash '/'. Directories within the path must be separated by
 * exactly one slash '/'. The path must not end with a slash '/', unless it is the root directory.
 * The path must not have any single or double periods ('.' and '..') used to denote current or
 * parent directories. Return the simplified canonical path.
 * <p>
 * Input: path = "/home/" Output: "/home"
 * <p>
 * Input: path = "/home//foo/" Output: "/home/foo"
 * <p>
 * Input: path = "/home/user/Documents/../Pictures" Output: "/home/user/Pictures"
 * <p>
 * Input: path = "/../" Output: "/"
 * <p>
 * Input: path = "/.../a/../b/c/../d/./" Output: "/.../b/d"
 */
public class SimplifyPath {

  public String simplifyPath(String path) {
    path = path.replaceAll("//{1,}", "/");
    Pattern compile = Pattern.compile("/\\./");
    while (compile.matcher(path).find()) {
      path = path.replaceAll("/\\./", "/");
    }
     compile = Pattern.compile("/\\.{2}/?");
    while (compile.matcher(path).find()) {
      path = path.replaceAll("(/\\w+)?/\\.{2}/?", "/");

    }
    path = path.replaceAll("/$", "");

    return path.isBlank() ? "/" : path;
  }


}
