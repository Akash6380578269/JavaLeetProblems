class Solution {
    public String longestCommonPrefix(String[] s) {
        String first = s[0];
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            for (int j = 0; j < s.length; j++) {
                if (i >= s[j].length() || s[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }

        }
        return first;

    }
}