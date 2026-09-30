class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int count = 0;
        int x = 0;
        int res[] = new int[seq.length()];
        for (char c : seq.toCharArray()) {
            if (c == '(') {
                count++;
                res[x++] = count % 2;
            } else {
                res[x++] = count-- % 2;
            }
        }
        return res;
    }
}