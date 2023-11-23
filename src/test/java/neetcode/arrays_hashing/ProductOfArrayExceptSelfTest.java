package neetcode.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductOfArrayExceptSelfTest {
    @Test
    void example1() {
        var solution = new ProductOfArrayExceptSelf();
        assertThat(solution.productExceptSelf(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{24, 12, 8, 6});
    }

    @Test
    void example2() {
        var solution = new ProductOfArrayExceptSelf();
        assertThat(solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3})).isEqualTo(new int[]{0, 0, 9, 0, 0});
    }

}