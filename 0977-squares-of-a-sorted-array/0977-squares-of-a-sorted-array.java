class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n - 1;
        while (left <= right) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];
            if (leftsq < rightsq) {
                res[pos--] = rightsq;
                right--;
            } else {
                res[pos--] = leftsq;
                left++;
            }

        }

        return res;
    }
}