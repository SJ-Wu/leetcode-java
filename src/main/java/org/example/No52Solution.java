package org.example;

import java.util.ArrayList;
import java.util.List;

public class No52Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;
        int total = col * row;
        ArrayList<Integer> spiral = new ArrayList<>();
        Direction turn = Direction.RIGHT; // 0: right, 1: down, 2: left, 3: up
        int i = 0, j = 0;
        int layer = 0;
        while (spiral.size() < total) {
            // right
            switch (turn) {
                case RIGHT:
                    if (j < row - layer) {
                        spiral.add(matrix[i][j++]);
                    } else {
                        i++;
                        j--;
                        turn = Direction.DOWN;
                    }
                    break;
                case DOWN:
                    if (i < col - layer) {
                        spiral.add(matrix[i++][j]);
                    } else {
                        i--;
                        j--;
                        turn = Direction.LEFT;
                    }
                    break;
                case LEFT:
                    if (j >= layer) {
                        spiral.add(matrix[i][j--]);
                    } else {
                        i--;
                        j++;
                        turn = Direction.UP;
                    }
                    break;
                case UP:
                    if (i >= layer + 1) {
                        spiral.add(matrix[i--][j]);
                    } else {
                        i++;
                        j++;
                        turn = Direction.RIGHT;
                        layer++;
                    }
                    break;
                default:
                    throw new RuntimeException("No assigned direction");
            }
        }
        return spiral;
    }

    enum Direction {
        RIGHT,
        DOWN,
        LEFT,
        UP
    }
}
