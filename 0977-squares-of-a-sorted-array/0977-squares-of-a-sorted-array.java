class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int pos = nums.length - 1;

        while (i <= j) {
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];
            if (left < right) {
                res[pos--] = right;
                j--;
            } else {
                res[pos--] = left;
                i++;
            }
        }
        return res;
    }
}