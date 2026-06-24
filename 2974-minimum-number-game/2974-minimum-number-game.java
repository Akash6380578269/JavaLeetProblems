class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int c[]=new int[nums.length];
        int k =0;
        for(int i=1;i<nums.length;i+=2){
            c[k++]=nums[i];
            c[k++]=nums[i-1];
        }
        return c;
    }
}