class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        int freq[] = new int[n * n + 1];
        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;
            }
        }
        int res = -1;
        int mis = -1;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2) {
                res = i;
            }
            if (freq[i] == 0) {
                mis = i;
            }
        }
        return new int[] { res, mis };
    }
}