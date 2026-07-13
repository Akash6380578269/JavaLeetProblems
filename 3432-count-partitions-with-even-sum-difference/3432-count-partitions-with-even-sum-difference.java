class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int x : nums) {
            sum += x;
        }
        int xsum=0;
        for (int i = 0; i < nums.length; i++) {
            xsum += nums[i];
            sum -= Math.abs(xsum*2);
            if (sum % 2 == 0) {
                count++;
            }
        }
        return count==0?0:count-1;
    }
}