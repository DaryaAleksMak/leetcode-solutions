package org.example.solutions.matrix;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * You are given an m x n matrix of characters boxGrid representing a side-view of a box. Each cell
 * of the box is one of the following:
 * <p>
 * A stone '#' A stationary obstacle '*' Empty '.'
 */
public class RotatingTheBox {

  public char[][] rotateTheBox(char[][] boxGrid) {

    Map<Integer, LinkedList<Character>> queueHashMap = new LinkedHashMap<>();
    for (int i = 0; i < boxGrid.length; i++) {
      LinkedList<Character> characters = new LinkedList<>();
      queueHashMap.put(i, characters);
      for (int j = boxGrid[0].length - 1; j > 0; j--) {
        char currentCharacter = boxGrid[i][j];
        if (characters.peekLast() == null) {
          characters.add(currentCharacter);
        }

        while (characters.peekLast() == '.') {
          Character emptySpaceCharacter = characters.removeLast();
          characters.addLast(currentCharacter);
          characters.addLast(emptySpaceCharacter);

        }


      }
    }

    int newRowCount = boxGrid[0].length;
    int newColumnCount = boxGrid.length;
    char[][] result = new char[newRowCount][newColumnCount];

    for (int i = 0; i < newColumnCount; i++) {
      for (int j = 0; j < newRowCount; j++) {
        result[j][newColumnCount - 1 - i] = boxGrid[i][j];
      }
    }

    return result;

  }

}

