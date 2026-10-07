class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        ArrayList<Integer> list = new ArrayList<>();

        int end = 0;
        int st = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);

            if (i == end) {
                list.add(end - st + 1);
                st = i + 1;
            }
        }
        return list;

    }
}