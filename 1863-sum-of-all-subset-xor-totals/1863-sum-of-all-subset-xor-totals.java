class Solution {
    public int subsetXORSum(int[] nums) {
        int t = 0;
        for (int i = 0; i < (1<<nums.length); i++) {
            int sub = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    sub ^= nums[j];
                }
            }
            t += sub;
        }
        return t;
    }
}