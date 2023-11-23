package neetcode.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void example1() {
        assertThat(solution.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
    }

    @Test
    void example2() {
        assertThat(solution.twoSum(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
    }

    @Test
    void example3() {
        assertThat(solution.twoSum(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
    }


}
