class Solution {
    public int pivotInteger(int n) {
        int t = n * (n + 1) / 2;

        int lsum = 0;
        //int rsum = 0;
        for (int i = 1; i <= n; i++) {
            lsum += i;
        int  rsum = t - lsum + i;
            if (lsum == rsum)
                return i;
        }
        return -1;
    }
}