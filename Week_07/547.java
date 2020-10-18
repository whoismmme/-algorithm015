class Solution {
    public int findCircleNum(int[][] M) {
        if (M.length == 0) {
            return 0;
        }
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                dfs(M, visited, i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] M, int[] v, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && v[j] == 0) {
                v[j] = 1;
                dfs(M, v, j);
            }
        }
    }

}