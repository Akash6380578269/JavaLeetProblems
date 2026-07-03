class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Max = 0;
        int count = 0;
        for (int x : nums) {
            if (x == 1) {
                count++;
            } else {
                count = 0;
            }
            Max = Math.max(Max, count);
        }
        return Max;
    }
}