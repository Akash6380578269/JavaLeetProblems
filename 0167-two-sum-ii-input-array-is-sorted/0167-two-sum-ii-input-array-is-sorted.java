class Solution {
    public int[] twoSum(int[] num, int target) {
       int left = 0;
       int right = num.length-1;
       int sum=0;
       while(left < right){
        sum=num[left]+num[right];
        if(sum==target){
            return new int[]{left+1,right+1};
        }
        if(sum > target){
            right--;
        }
        else{
            left++;
        }
        
       }
        return new int[]{};
    }
}