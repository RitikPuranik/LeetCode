class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] arr = new boolean[n][m];
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1' && !arr[i][j]) {
                    dfs(grid, arr, i, j, n, m);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, boolean[][] arr, int i, int j, int n, int m){
        arr[i][j] = true;

        if(j + 1 < m && grid[i][j + 1] == '1' && !arr[i][j + 1]) dfs(grid, arr, i, j + 1, n, m);
        if(j - 1 >= 0 && grid[i][j - 1] == '1' && !arr[i][j - 1]) dfs(grid, arr, i, j - 1, n, m);
        if(i + 1 < n && grid[i + 1][j] == '1' && !arr[i + 1][j]) dfs(grid, arr, i + 1, j, n, m);
        if(i - 1 >= 0 && grid[i - 1][j] == '1' && !arr[i - 1][j]) dfs(grid, arr, i - 1, j, n, m);
    }
}