class Solution {

   static boolean isPal(String s, int left, int right) {
    while (left < right) {
        if (s.charAt(left) != s.charAt(right))
            return false;
        left++;
        right--;
    }
    return true;
}
    public int countSubstrings(String s) {

       int count = 0;
       for (int i = 0; i < s.length(); i++) {
            for (int j = i+1;j<=s.length();j++) {
                   if(isPal(s,i,j-1)){
                        count++;
                   }
            }
       }
         return count;
    }   
}