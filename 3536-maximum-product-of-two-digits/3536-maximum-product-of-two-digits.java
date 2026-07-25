class Solution {
    public int maxProduct(int n) {
        int Max1 = Integer.MIN_VALUE;
        int Max2 = Integer.MIN_VALUE;
        while (n > 0) {
            int d=n%10;
            if(d>Max1){
                Max2=Max1;
                Max1=d;
            }
            else if(d>Max2){
                Max2=d;
            }
            n/=10;
          
        }
        return Max1*Max2;
    }
}