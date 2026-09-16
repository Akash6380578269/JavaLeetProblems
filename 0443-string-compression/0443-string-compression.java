class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        while (i < chars.length) {
            char current = chars[i];
            int count = 0;
            while (i < chars.length && current == chars[i]) {
                i++;
                count++;
            }
            chars[j++] = current;
            if (count > 1) {
                String s = String.valueOf(count);
                for (char c : s.toCharArray()) {
                    chars[j++] = c;
                }

            }

        }
        return j;
    }
}