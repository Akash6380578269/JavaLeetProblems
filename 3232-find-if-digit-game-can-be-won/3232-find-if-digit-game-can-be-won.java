class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int x : nums){
            if(x>=10){
                sum+=x;
            }
            else{
                sum1+=x;
            }
        }
        if(sum==sum1) return false;
        
        return true;

    }
}