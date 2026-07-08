class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum = 0;
        int sqsum = 0;
        while (n > 0) {
            int d = n % 10;
            dsum += d;
            sqsum += Math.pow(d, 2);
            n /= 10;
        }
        if (sqsum - dsum >= 50) {
            return true;
        }
        return false;
    }
}