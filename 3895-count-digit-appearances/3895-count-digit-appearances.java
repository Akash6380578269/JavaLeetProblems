class Solution {
    public int countDigitOccurrences(int[] nums, int d) {
        int count = 0;
        for (int num : nums) {
            if (num == 0 && d == 0) {
                count++;
            }
            while (num > 0) {
                if (num % 10 == d) {
                    count++;
                }
                num /= 10;
            }
        }
        return count;
    }
}