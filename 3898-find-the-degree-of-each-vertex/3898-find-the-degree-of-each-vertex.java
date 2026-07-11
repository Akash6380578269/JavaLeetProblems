class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            res[i] = sum;
        }
        return res;
    }
}