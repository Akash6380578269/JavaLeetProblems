class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        int sum1 = 0;
        for (int x : nums) {
            if (x > 9) {
                int k = x;
                while (k > 0) {
                    int d = k % 10;
                    sum1 += d;
                    k /= 10;
                }
            } else {
                sum1 += x;
            }
        }
        return Math.abs(sum - sum1);
    }
}