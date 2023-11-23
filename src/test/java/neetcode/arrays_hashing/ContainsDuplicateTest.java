package neetcode.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {

    @Test
    void example1() {
        var solution = new ContainsDuplicate();
        assertThat(solution.containsDuplicate(new int[]{1, 2, 3, 1})).isEqualTo(true);
    }

    @Test
    void example2() {
        var solution = new ContainsDuplicate();
        assertThat(solution.containsDuplicate(new int[]{1, 2, 3, 4})).isEqualTo(false);
    }

    @Test
    void example3() {
        var solution = new ContainsDuplicate();
        assertThat(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})).isEqualTo(true);
    }


}