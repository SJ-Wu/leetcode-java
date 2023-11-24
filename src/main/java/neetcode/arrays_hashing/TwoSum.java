package neetcode.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        var solution = new TwoSum();
        for (int i : solution.twoSum(new int[]{2, 7, 11, 15}, 9)) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            var d = target - num;
            if (diffs.containsKey(d)) {
                return new int[]{diffs.get(d), i};
            }
            diffs.put(nums[i], i);
        }
        return new int[]{};
    }
}
