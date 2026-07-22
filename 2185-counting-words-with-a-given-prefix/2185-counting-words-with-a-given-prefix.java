class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String s : words){

      if (s.length() < pref.length()) {
        continue;
    }
            boolean check=true;
            for(int i=0;i<pref.length();i++){
                 if(s.charAt(i)!=pref.charAt(i)){
                    check=false;
                    break;
                }
            }
            if(check){
                count++;
            }
        }
        return count;
    }
}