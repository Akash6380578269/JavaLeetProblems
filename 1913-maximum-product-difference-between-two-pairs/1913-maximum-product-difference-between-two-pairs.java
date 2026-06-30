class Solution {
    public int maxProductDifference(int[] nums) {
        int Max1 = Integer.MIN_VALUE;
        int Max2 = Integer.MIN_VALUE;
        int Min1 = Integer.MAX_VALUE;
        int Min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > Max1) {
                Max2 = Max1;
                Max1 = num;
            } else if (num > Max2) {
                Max2 = num;
            }
        }
        for (int num : nums) {
            if (num < Min1) {
                Min2 = Min1;
                Min1 = num;
            } else if (num < Min2) {
                Min2 = num;
            }
        }
        int mul1 = Max1 * Max2;
        int mul2 = Min1 * Min2;
        return mul1 - mul2;
    }
}