class Solution {

    boolean pacific;
    boolean atlantic;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                pacific = false;
                atlantic = false;

                boolean[][] vis = new boolean[m][n];

                dfs(heights, i, j, m, n, vis);

                if (pacific && atlantic) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }

    private void dfs(int[][] heights, int i, int j, int m, int n, boolean[][] vis) {

        if (vis[i][j]) return;

        vis[i][j] = true;

        // Pacific reached
        if (i == 0 || j == 0) {
            pacific = true;
        }

        // Atlantic reached
        if (i == m - 1 || j == n - 1) {
            atlantic = true;
        }

        if (pacific && atlantic) return;

        // Down
        if (i + 1 < m && heights[i][j] >= heights[i + 1][j]) {
            dfs(heights, i + 1, j, m, n, vis);
        }

        // Up
        if (i - 1 >= 0 && heights[i][j] >= heights[i - 1][j]) {
            dfs(heights, i - 1, j, m, n, vis);
        }

        // Right
        if (j + 1 < n && heights[i][j] >= heights[i][j + 1]) {
            dfs(heights, i, j + 1, m, n, vis);
        }

        // Left
        if (j - 1 >= 0 && heights[i][j] >= heights[i][j - 1]) {
            dfs(heights, i, j - 1, m, n, vis);
        }
    }
}