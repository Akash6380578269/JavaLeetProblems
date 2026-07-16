class Solution {
    public int firstMissingPositive(int[] nums) {
        int n =  nums.length;
        int map[] = new int[n+1];  
        for(int x:nums){
            if(x>0&&x<=n){
                map[x]=1;
            }
        }
        for(int i=1;i<=n;i++){
            if(map[i]!=1)return i;
        }
       
       return n+1;
    }
}