package neetcode.arrays_hashing;

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
        return "";
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        return List.of();
    }
}
