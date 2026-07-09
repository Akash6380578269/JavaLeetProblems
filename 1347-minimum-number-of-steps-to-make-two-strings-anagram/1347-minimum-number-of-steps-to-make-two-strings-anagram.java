class Solution {
    public int minSteps(String s, String t) {
        if (s.equals(t))
            return 0;

        int ans[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i) - 'a']++;
            ans[t.charAt(i) - 'a']--;
        }
        int count = 0;
        for (int x : ans) {
            if (x > 0) {
                count += x;
            }
        }
        return count;

    }
}