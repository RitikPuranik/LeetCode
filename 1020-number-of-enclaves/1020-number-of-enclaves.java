class Solution {
    int[][] directions = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for(int i = 0; i < m; i++){
            if(grid[i][0] == 1) dfs(grid, m, n, i, 0);
            if(grid[i][n - 1] == 1) dfs(grid, m, n, i, n - 1);
        }
        for(int i = 0; i < n; i++){
            if(grid[0][i] == 1) dfs(grid, m, n, 0, i);
            if(grid[m - 1][i] == 1) dfs(grid, m, n, m - 1, i);
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(grid[i][j] == 1) count++;
            }
        }
        return count;
    }
    private void dfs(int[][] grid, int m, int n, int i, int j){
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) return ;
        grid[i][j] = 0;

        dfs(grid, m, n, i + 1, j);
        dfs(grid, m, n, i - 1, j);
        dfs(grid, m, n, i, j + 1);
        dfs(grid, m, n, i, j - 1);

    }
}