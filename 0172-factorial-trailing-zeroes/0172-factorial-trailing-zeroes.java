class Solution {
    public int trailingZeroes(int n) {
        int c = 0;
        int d = 0;
        while (n!=0) {
             n/=5;
            c+=n;
    }
        return c;
    }
}