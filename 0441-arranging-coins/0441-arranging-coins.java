class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        long sum = 0;
        int res = n;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (res < sum) {
                ans = i - 1;
                break;
            }
        }

        return ans;
    }
}