class Solution {
    public String longestPalindrome(String s) {
         String s1="";
         for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(isPal(s,i,j-1)){
                    String curr=s.substring(i,j);
                
                if(curr.length()>s1.length()){
                    s1=curr;
                }
                }
            }
         }
            return s1;
    }
        
        

           static boolean isPal(String s,int left,int right){
                    while(left<right){
                        if(s.charAt(left)!=s.charAt(right)){
                            return false;
                        }
                        left++;
                        right--;
              }
              return true;
           }
          
}