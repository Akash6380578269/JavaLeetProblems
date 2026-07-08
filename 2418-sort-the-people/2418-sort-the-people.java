class Solution {
    public String[] sortPeople(String[] names, int[] h) {
        TreeMap<Integer, String> map = new TreeMap<>();
        int n = h.length;

        for (int i = 0; i < n; i++) {
            map.put(h[i], names[i]);
        }
        String ans[] = new String[n];
        int i = 0;
        for (String value : map.descendingMap().values()) {
            ans[i++] = value;
        }
        return ans;

    }
}