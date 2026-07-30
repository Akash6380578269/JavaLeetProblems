class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= s.length() - p.length(); i++) {
            int freq[] = new int[26];
            boolean check = true;
            for (char c : p.toCharArray()) {
                freq[c - 'a']++;
            }
            for (int j = i; j < i + p.length(); j++) {
                freq[s.charAt(j) - 'a']--;
                if (freq[s.charAt(j) - 'a'] < 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                list.add(i);
            }
        }

        return list;
    }
}