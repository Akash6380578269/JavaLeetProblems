class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s = "";
        String s1 = "";
       
        for (String c : word1) {
            s += c;
        }
        for (String c : word2) {
            s1 += c;
        }
        return s1.equals(s);
    }
}