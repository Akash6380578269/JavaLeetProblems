class Solution {
    public int smallestIndex(int[] nums) {
        // int sum = 0;
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d;
                n /= 10;
            }
            if (sum == i) {
            
            min = Math.min(min, i);
            }

        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
