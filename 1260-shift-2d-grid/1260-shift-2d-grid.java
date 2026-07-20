class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        List<List<Integer>> list = new ArrayList<>();
      // int[][] ans = new int[n][m];
        while (k-- > 0) {
            int last = grid[n - 1][m - 1];
            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    if (j == 0) {
                        grid[i][j] = grid[i-1][m - 1];
                    } else {
                        grid[i][j] = grid[i][j - 1];
                    }
                }
            }
            grid[0][0] = last;
        }

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                row.add(grid[i][j]);

            }
            list.add(row);
        }
        return list;

    }
}