package neetcode.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LargestRectangleHistogramTests {
    @Test
    void example_down() {
        var solution = new LargestRectangleHistogram();
        var heights = new int[]{6, 5, 4, 3, 2, 1};
        assertThat(solution.largestRectangleArea(heights)).isEqualTo(12);
    }

    @Test
    void example_rise() {
        var solution = new LargestRectangleHistogram();
        var heights = new int[]{1, 2, 3, 4, 5, 6};
        assertThat(solution.largestRectangleArea(heights)).isEqualTo(12);
    }

    @Test
    void example_1() {
        var solution = new LargestRectangleHistogram();
        var heights = new int[]{2, 1, 5, 6, 2, 3};
        assertThat(solution.largestRectangleArea(heights)).isEqualTo(10);
    }

}
