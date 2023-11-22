package neetcode.arrays_hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {

    @Test
    void example1() {
        var validAnagram = new ValidAnagram();
        assertThat(validAnagram.solution.isAnagram("anagram", "nagaram")).isEqualTo(true);
    }

    @Test
    void example2() {
        var validAnagram = new ValidAnagram();
        assertThat(validAnagram.solution.isAnagram("rat", "car")).isEqualTo(false);
    }

}