class Solution {

    static boolean isPal(String t) {
        return t.equals(new StringBuilder(t).reverse().toString());
    }

    public int countSubstrings(String s) {

       int count = 0;
       for (int i = 0; i < s.length(); i++) {
            for (int j = i+1;j<=s.length();j++) {
                   if(isPal(s.substring(i,j))){
                        count++;
                   }
            }
       }
         return count;
    }   
}