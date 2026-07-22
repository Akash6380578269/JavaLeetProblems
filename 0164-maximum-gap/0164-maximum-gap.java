class Solution {
    public int maximumGap(int[] nums) {
        int MaxDiff=0;
       Arrays.sort(nums);
       for(int i=1;i<nums.length;i++){
         int diff=nums[i]-nums[i-1];
         MaxDiff=Math.max(MaxDiff,diff);
       }
       return MaxDiff;
    }
}