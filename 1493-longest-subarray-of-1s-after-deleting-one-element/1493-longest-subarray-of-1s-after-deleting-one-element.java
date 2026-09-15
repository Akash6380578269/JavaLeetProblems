class Solution {
    public int longestSubarray(int[] nums) {
        int Max = 0;
        for (int i = 0; i < nums.length; i++) {
            int z = 0;
             int len=0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    z++;
                }
                if (z > 1) {
                    break;
                }
                 len = j - i;
            }

                Max = Math.max(Max, len);
            
        }
        return Max;
    }
}