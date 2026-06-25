class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int n = heights.length;
        int c[] = new int[n];
        int k = 0;
        for (int x : heights) {
            c[k++] = x;
        }
        Arrays.sort(c);
        for (int i = 0; i < n; i++) {
            if (heights[i] != c[i]) {
                count++;
            }
        }
        return count;

    }
}