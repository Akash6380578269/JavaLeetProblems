class Solution {
    public int maximizeSum(int[] nums, int k) {
        int Max = 0;
        for (int x : nums) {
            Max = Math.max(Max, x);
        }
        int sum = Max;
        k = k - 1;
        while (k > 0) {
            Max += 1;
            sum += Max;
            k--;
        }
        return sum;
    }
}