class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();
if(n<1) return true;

        int i = 0;
        int j = 0;
        while (j < m) {
            if (c1[i] == c2[j]) {
                i++;
            }
            j++;
            if (i == n)
                return true;
        }
        return false;
    }
}