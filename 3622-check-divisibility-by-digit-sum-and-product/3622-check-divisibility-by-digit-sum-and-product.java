class Solution {
    public boolean checkDivisibility(int n) {
        if (n <= 9) {
            return false;
        }
        int t = n;
        int pr = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            pr *= digit;
            n /= 10;
        }
        int ans = pr + sum;
        return t % ans == 0;
    }
}