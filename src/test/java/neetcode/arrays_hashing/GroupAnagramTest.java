package neetcode.arrays_hashing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GroupAnagramTest {

    @Test
    void example1() {
        GroupAnagram groupAnagram = new GroupAnagram();
        GroupAnagram.Solution solution = groupAnagram.new Solution();

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("tan", "nat"),
                Collections.singletonList("bat")
        );

        List<List<String>> result = solution.groupAnagrams(input);
        for (List<String> list : result) {
            Collections.sort(list);
        }
        assertTrue(containsAllLists(expected, result));
    }

    // Helper method to check if two lists of lists contain the same elements
    private boolean containsAllLists(List<List<String>> list1, List<List<String>> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (List<String> sublist : list1) {
            if (!listContainsList(list2, sublist)) {
                return false;
            }
        }
        return true;
    }

    // Helper method to check if a list of lists contains a specific list
    private boolean listContainsList(List<List<String>> list, List<String> sublist) {
        for (List<String> l : list) {
            if (l.containsAll(sublist) && sublist.containsAll(l)) {
                return true;
            }
        }
        return false;
    }
}