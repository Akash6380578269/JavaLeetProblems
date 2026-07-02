class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n * 2];
        int i = 0;
        for (int x : nums) {
            ans[i++] = x;
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            ans[i++] = nums[j];
        }
        return ans;
    }
}