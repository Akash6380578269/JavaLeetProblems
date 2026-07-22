class Solution {
    public String sortSentence(String s) {
        TreeMap<Integer, String> map = new TreeMap<>();
        String s1[] = s.split(" ");
        String ans[] = new String[s1.length];
        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            char last = s1[i].charAt(s1[i].length() - 1);
            int len = last - '0';
            map.put(len, word);
        }
        StringBuilder sb = new StringBuilder();

        for (String word : map.values()) {
            sb.append(word.substring(0, word.length() - 1)).append(" ");
        }

        return sb.toString().trim();

    }
}