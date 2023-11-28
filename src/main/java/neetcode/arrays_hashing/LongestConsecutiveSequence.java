package neetcode.arrays_hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        var nums = new int[]{100, 4, 200, 1, 3, 2};
        var solution = new LongestConsecutiveSequence();
        System.out.println(solution.longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        Arrays.stream(nums).forEach(numSet::add);
        var longest = 0;
        for (Integer num : numSet) {
            if (!numSet.contains(num - 1)) {
                var length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
