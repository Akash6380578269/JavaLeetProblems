class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int MaxOne = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
            while (count > k) {
                if (nums[left] == 0) {
                    count--;
                }
                left++;
            }
            MaxOne = Math.max(MaxOne, i - left + 1);

        }
        return MaxOne;
    }
}