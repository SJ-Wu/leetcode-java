package neetcode.arrays_hashing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class EncodeAndDecodeTest {

    @Test
    void example1() {
        var solution = new EncodeAndDecode();
        var words = List.of("Hello", "World");
        assertThat(solution.decode(solution.encode(words))).isEqualTo(words);
    }

    @Test
    void example2() {
        var solution = new EncodeAndDecode();
        var words = List.of("");
        assertThat(solution.decode(solution.encode(words))).isEqualTo(words);
    }

}