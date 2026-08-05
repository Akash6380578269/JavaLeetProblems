class Solution {
    public int countValidPrefixes(String s) {
        int res = 0;
        int z = 0;
        int o = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                z++;
            } else {
                o++;
            }
            if (Math.abs(o - z) <= 1) {
                res++;
            }

        }
        return res;
    }
}