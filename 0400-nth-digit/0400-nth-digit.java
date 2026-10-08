class Solution {
    public int findNthDigit(int n) {

        long digits = 1;
        long count = 9;
        long start = 1;

        // Step 1: Find which group contains n
        while (n > digits * count) {
            n -= digits * count;

            digits++;
            count *= 10;
            start *= 10;
        }

        // Step 2: Find the actual number
        long num = start + (n - 1) / digits;

        // Step 3: Find which digit inside the number
        int index = (int)((n - 1) % digits);

        String s = String.valueOf(num);

        return s.charAt(index) - '0';
    }
}