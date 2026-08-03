class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int Max = Integer.MIN_VALUE;
        int curr = 0;
        int total = 0;
        int Min=nums[0];
        int currmin=0;
        for (int x : nums) {
            total += x;
            curr = Math.max(x, curr + x);
            Max = Math.max(Max, curr);
            currmin=Math.min(x,currmin+x);
            Min=Math.min(Min,currmin);

        }
        if (Max < 0) {
            return Max;
        }
        return Math.max(Max,total-Min);

    }
}