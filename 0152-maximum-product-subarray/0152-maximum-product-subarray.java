class Solution {
    public int maxProduct(int[] nums) {
        int Max = nums[0];
        int Min = nums[0];
        int ans = nums[0];
        for (int i=1;i<nums.length;i++) {
            int x =nums[i];
            if (x < 0) {
                int temp = Max;
                Max = Min;
                Min = temp;
            }
            Max = Math.max(x, Max * x);
            Min = Math.min(x, Min * x);
            ans = Math.max(ans, Max);
        }
        return ans;
    }
}