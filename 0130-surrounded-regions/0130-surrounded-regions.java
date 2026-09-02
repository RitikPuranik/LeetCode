class Solution {
    int[][] dimensions = new int[][]{ {0, 1}, {1, 0}, {0, -1}, {-1, 0} };
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] arr = new int[m][n];

        for(int i = 0; i < m; i++){
            if(board[i][0] == 'O' && arr[i][0] == 0) dfs(board, arr, m, n, i, 0);
            if(board[i][n - 1] == 'O' && arr[i][n - 1] == 0) dfs(board, arr, m, n, i, n - 1);
        }
        for(int i = 0; i < n; i++){
            if(board[0][i] == 'O' && arr[0][i] == 0) dfs(board, arr, m, n, 0, i);
            if(board[m - 1][i] == 'O' && arr[m - 1][i] == 0) dfs(board, arr, m, n, m - 1, i);
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(board[i][j] == 'O' && arr[i][j] == 0) board[i][j] = 'X';
            }
        }
    }
    private void dfs(char[][] board, int[][] arr, int m, int n, int i, int j){
        arr[i][j] = 1;

        for(int[] dir : dimensions){
            int x = dir[0] + i;
            int y = dir[1] + j;

            if(x < m && x >= 0 && y < n && y >= 0 && arr[x][y] == 0 && board[x][y] != 'X'){
                dfs(board, arr, m, n, x, y);
            }
        }
    }
}