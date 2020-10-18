class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int count = 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, m, n, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] g, int m, int n, int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n || g[i][j] == '0') {
            return;
        }
        g[i][j] = '0';
        dfs(g, m, n, i - 1, j);
        dfs(g, m, n, i, j - 1);
        dfs(g, m, n, i + 1, j);
        dfs(g, m, n, i, j + 1);
    }
}