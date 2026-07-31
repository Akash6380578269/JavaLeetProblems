class Solution {
    public int minimumPushes(String s) {
        int freq[] = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int p = 8;
        int ans = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] != 0) {
                ans += freq[i] *( p / 8);
                p++;
            }
        }
        return ans;
    }
}
