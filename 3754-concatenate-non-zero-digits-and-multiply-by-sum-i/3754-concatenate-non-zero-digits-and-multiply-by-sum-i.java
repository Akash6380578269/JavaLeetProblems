class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long x = 0;
        long p = 1;
        while (n > 0) {
            long d = n % 10;
            if (d != 0) {
                x = p * d + x;
                p *= 10;
                sum += d;
            }
            n /= 10;
        }
        return x * sum;
    }
}