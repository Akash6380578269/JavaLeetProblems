class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 10;
        int u = 9;
        int av = 9;
        for (int i = 2; i <= n; i++) {
            u = u * av;
            ans += u;
            av--;
        }
        return ans;

    }
}