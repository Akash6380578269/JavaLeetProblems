class Solution {
    public int[] transformArray(int[] nums) {
        int i = 0;
        int n = nums.length;
        int ans[] = new int[n];
        for (int x : nums) {
            if (x % 2 == 1) {
                ans[i++] = 1;
            } else
                ans[i++] = 0;
        }
        int count0 = 0;
        int count1 = 0;
        for (int x : ans) {
            if (x == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        int j = 0;
        while (count0 > 0) {
            ans[j++] = 0;
            count0--;
        }
        while (count1 > 0) {
            ans[j++] = 1;
            count1--;
        }

        return ans;
    }
}