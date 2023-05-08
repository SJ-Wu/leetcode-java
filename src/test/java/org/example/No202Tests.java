package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class No202Tests {
    @Test
    void case1_true() {
        No202Solution solution = new No202Solution();
        assertThat(solution.isHappy(19)).isEqualTo(true);
    }

    @Test
    void case2_false() {
        No202Solution solution = new No202Solution();
        assertThat(solution.isHappy(2)).isEqualTo(false);
    }

}
