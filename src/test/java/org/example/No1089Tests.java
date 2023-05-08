package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class No1089Tests {
    @Test
    void case1() {
        int[] input = {1, 0, 2, 3, 0, 4, 5, 0};
        No1089Solution solution = new No1089Solution();
        solution.duplicateZeros(input);
        Assertions.assertThat(input).isEqualTo(new int[]{1, 0, 0, 2, 3, 0, 0, 4});
    }
}
