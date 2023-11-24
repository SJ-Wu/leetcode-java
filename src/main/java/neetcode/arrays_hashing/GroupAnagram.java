package neetcode.arrays_hashing;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {
        var solution = new GroupAnagram();
        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            var chars = str.toCharArray();
            Arrays.sort(chars);
            var key = Arrays.toString(chars);
            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}
