package neetcode.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TopKFrequentElementTest {
    @Test
    void example1() {
        var solution = new TopKFrequentElement();
        assertThat(solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)).isEqualTo(new int[]{1, 2});
    }
}