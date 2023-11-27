package neetcode.arrays_hashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
    // Encodes a list of strings to a single string.
    public static void main(String[] args) {
        var solution = new EncodeAndDecode();
        var encode = solution.encode(List.of("Hello", "World"));
        var decode = solution.decode(encode);
        System.out.println(decode);
    }

    public String encode(List<String> strs) {
        var result = new StringBuilder();
        for (String s : strs) {
            result.append(s.length()).append("#").append(s);
        }
        return result.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        var i = 0;
        while (i < s.length()) {
            var j = i;
            while (s.charAt(j) != '#') j++;
            i = j + 1 + Integer.parseInt(s.substring(i, j));
            result.add(s.substring(j + 1, i));
        }
        return result;
    }}
