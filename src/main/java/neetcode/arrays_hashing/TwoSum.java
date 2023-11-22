package neetcode.arrays_hashing;

public class TwoSum {
    Solution solution = new Solution();

    public static void main(String[] args) {
        var twoSum = new TwoSum();
        for (int i : twoSum.solution.twoSum(new int[]{2, 7, 11, 15}, 9)) {
            System.out.println(i);
        }
    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            return new int[]{};
        }
    }
}
