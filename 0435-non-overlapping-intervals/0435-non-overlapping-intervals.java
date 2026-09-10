class Solution {
    public int eraseOverlapIntervals(int[][] inte) {
        Arrays.sort(inte, (a, b) -> a[1] - b[1]);
        int prev = inte[0][1];
        int count = 0;
        for (int i = 1; i < inte.length; i++) {
            int crr = inte[i][0];
            if (crr < prev) {
                count++;
            } else {
                prev = inte[i][1];
            }
        }
        return count;
    }
}