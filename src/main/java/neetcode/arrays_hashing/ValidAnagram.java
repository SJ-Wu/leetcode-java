package neetcode.arrays_hashing;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        var solution = new ValidAnagram();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        var count_s = new int[26];
        var count_t = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count_s[s.charAt(i) - 'a']++;
            count_t[t.charAt(i) - 'a']++;
        }
        return Arrays.equals(count_s, count_t);
    }
}
