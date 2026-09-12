class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        
        int c1 = 0;
        for (String s : words) {
            boolean cheat=true;
            for (char c : s.toCharArray()) {
                if (!set.contains(c)) {
                     cheat=false;
                     break;
                } 
            }
            if(cheat){
               c1++;
            }
           
        }
        return c1;
    }
}