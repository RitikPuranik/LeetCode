class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int start = image[sr][sc];

        if (start == color) {
            return image;
        }

        dfs(image, sr, sc, color, start);

        return image;
    }

    private void dfs(int[][] image, int i, int j, int color, int start) {
        image[i][j] = color;

        int m = image.length;
        int n = image[0].length;

        if (i + 1 < m && image[i + 1][j] == start) {
            dfs(image, i + 1, j, color, start);
        }

        if (i - 1 >= 0 && image[i - 1][j] == start) {
            dfs(image, i - 1, j, color, start);
        }

        if (j + 1 < n && image[i][j + 1] == start) {
            dfs(image, i, j + 1, color, start);
        }

        if (j - 1 >= 0 && image[i][j - 1] == start) {
            dfs(image, i, j - 1, color, start);
        }
    }
}
