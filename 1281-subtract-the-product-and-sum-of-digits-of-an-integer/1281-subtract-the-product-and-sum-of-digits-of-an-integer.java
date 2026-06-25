class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pr = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            pr *= d;
            n /= 10;
        }
        return pr - sum;
    }
}