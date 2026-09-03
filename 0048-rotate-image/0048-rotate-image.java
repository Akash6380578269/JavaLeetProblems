class Solution {
    public void rotate(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < r; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < r; i++) {
            int l = 0;
            int ri = r-1;
            for (int j = 0; j < c; j++) {
                while (l < ri) {
                    int temp = a[i][l];
                    a[i][l] = a[i][ri];
                    a[i][ri] = temp;
                    l++;
                    ri--;
                }

            }
        }

    }
}