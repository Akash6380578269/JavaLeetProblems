class Solution {
    public int maxDepth(String s) {
        int Max = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                Max = Math.max(Max, count);

            } else if(c==')') {
                count--;
            }
        }
        return Max;
    }
}