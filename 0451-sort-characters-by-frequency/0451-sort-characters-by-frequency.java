class Solution {
    public String frequencySort(String s) {
        int freq[] = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                list.add((char) i);
            }
        }
        list.sort((a, b) -> freq[b] - freq[a]);
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            for (int i = 0; i < freq[c]; i++) {
                sb.append(c);
            }
        }
        return sb.toString();

    }
}