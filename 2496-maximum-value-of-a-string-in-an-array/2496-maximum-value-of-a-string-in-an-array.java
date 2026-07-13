class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String s : strs) {
            boolean isnum = true;
            int num = 0;
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isnum = false;
                    break;
                }
                num = num * 10 + (c - '0');
            }

            if (isnum) {
                max = Math.max(max, num);
            } else {
                max = Math.max(max, s.length());
            }
        }

        return max;
    }
}