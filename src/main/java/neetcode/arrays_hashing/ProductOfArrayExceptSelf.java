package neetcode.arrays_hashing;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        var products = new int[nums.length];
        var prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            products[i] = prefix;
            prefix *= nums[i];
        }
        var postfix = 1;
        for (int i = nums.length-1; i >=0; i--) {
            products[i] *= postfix;
            postfix *= nums[i];
        }
        return products;
    }
}
