package neetcode.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {

    private final ValidAnagram solution = new ValidAnagram();

    @Test
    void example1() {
        assertThat(solution.isAnagram("anagram", "nagaram")).isEqualTo(true);
    }

    @Test
    void example2() {
        assertThat(solution.isAnagram("rat", "car")).isEqualTo(false);
    }

}