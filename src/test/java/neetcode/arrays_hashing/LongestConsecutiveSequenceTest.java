package neetcode.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestConsecutiveSequenceTest {
    @Test
    void example1() {
        var nums = new int[]{100, 4, 200, 1, 3, 2};
        var solution = new LongestConsecutiveSequence();
        assertThat(solution.longestConsecutive(nums)).isEqualTo(4);
    }

    @Test
    void example2() {
        var nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        var solution = new LongestConsecutiveSequence();
        assertThat(solution.longestConsecutive(nums)).isEqualTo(9);
    }

    @Test
    void example3_corner_case1_empty() {
        var nums = new int[]{};
        var solution = new LongestConsecutiveSequence();
        assertThat(solution.longestConsecutive(nums)).isEqualTo(0);
    }

    @Test
    void example4_corner_case2_0() {
        var nums = new int[]{0};
        var solution = new LongestConsecutiveSequence();
        assertThat(solution.longestConsecutive(nums)).isEqualTo(1);
    }


}