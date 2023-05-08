package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class No52Tests {

    private final No52Solution solution = new No52Solution();

    @Test
    void case1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Assertions.assertThat(solution.spiralOrder(matrix)).isEqualTo(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5));
    }

    @Test
    void case2() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Assertions.assertThat(solution.spiralOrder(matrix)).isEqualTo(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7));
    }

}
