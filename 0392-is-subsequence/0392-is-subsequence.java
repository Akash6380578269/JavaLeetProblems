class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        char c[] = s.toCharArray();
        char c1[] = t.toCharArray();
        int i = 0;
        int j = 0;
        if(n<1) return true;

        while (j < m) {
            if (c[i] == c1[j]) {
                i++;
            }
            j++;

            if (i == n)
                return true;

        }
        return false;

    }
}