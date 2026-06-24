class Solution {
    public boolean checkIfPangram(String sentence) {
        int freq[] = new int[26];
        int i = 0;
        for (char c : sentence.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int x : freq) {
            if (x == 0) {
                return false;
            }
        }
        return true;
    }
}