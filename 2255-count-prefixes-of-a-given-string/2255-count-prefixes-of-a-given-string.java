class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String o : words) {
            if (s.startsWith(o)) {
                count++;
            }
        }
        return count;
    }
}