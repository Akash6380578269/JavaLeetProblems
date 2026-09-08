class Solution {
    public int integerBreak(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int pr = 1;
        while (n > 4) {
            pr *= 3;
            n -= 3;
        }
        pr *= n;
        return pr;
    }
}