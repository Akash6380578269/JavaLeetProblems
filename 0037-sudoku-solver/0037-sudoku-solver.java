class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board, 0, 0);
    }

    private boolean backtrack(char[][] board, int row, int col){
        if(col == 9){
            col = 0;
            row++;
        }

        if(row == 9){
            return true;
        }

        if(board[row][col] == '.'){
            for(char num = '1'; num <= '9'; num++){
                if(isSafe(board, row, col, num)){
                    board[row][col] = num;

                    if(backtrack(board, row, col + 1)){
                        return true;
                    }

                    board[row][col] = '.';
                }
            }

            return false;
        } else {
            return backtrack(board, row, col + 1);
        }
    }

    private boolean isSafe(char[][] board, int row, int col, char num){
        for(int c = 0; c < 9; c++){
            if(board[row][c] == num){
                return false;
            }
        }

        for(int r = 0; r < 9; r++){
            if(board[r][col] == num){
                return false;
            }
        }

        int gridRow = row / 3 * 3;
        int gridCol = col / 3 * 3;

        for(int r = gridRow; r < gridRow + 3; r++){
            for(int c = gridCol; c < gridCol + 3; c++){
                if(board[r][c] == num){
                    return false;
                }
            }
        }

        return true;
    }
}