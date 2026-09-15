class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int ans = 0;
        int Max = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'A']++;
            Max = Math.max(Max, freq[s.charAt(i) - 'A']);

            int change = (i - j + 1) - Max;
            if (change > k) {
                freq[s.charAt(j) - 'A']--;
                j++;
            }
            ans = Math.max(ans, i - j + 1);

        }
        return ans;

    }
}