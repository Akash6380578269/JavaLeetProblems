class Solution {
    public int mirrorDistance(int n) {
        int temp = n;
        int res = 0;
        while (n > 0) {
            int d = n % 10;
            res = res * 10 + d;
            n /= 10;
        }
        return (int) Math.abs(temp - res);
    }
}