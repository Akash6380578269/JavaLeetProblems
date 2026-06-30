class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int mul1 = nums[0] * nums[1];
        int mul2 = nums[nums.length - 1] * nums[nums.length - 2];
        return Math.abs(mul1 - mul2);
    }
}