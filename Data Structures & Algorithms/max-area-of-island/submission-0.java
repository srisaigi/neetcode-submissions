class Solution {
    public int maxAreaOfIsland(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int max =0;
            boolean[][] vis = new boolean[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j] == 1 && !vis[i][j]){
                        int num = dfs(grid,i,j,m,n,vis);
                        max = Math.max(max,num);
                    }
                }
            }
            return max;
    }
    private int dfs(int[][] mat,int i,int j,int m,int n,boolean[][] vis){
        if(i < 0 || j < 0 || i >= m || j >= n || mat[i][j] != 1 || vis[i][j]){
            return 0;
        }
        vis[i][j] = true;
        int up = dfs(mat,i-1,j,m,n,vis);
        int down = dfs(mat,i,j-1,m,n,vis);
        int left = dfs(mat,i,j+1,m,n,vis);
        int right = dfs(mat,i+1,j,m,n,vis);
        return 1 + up + down + left + right;
    }
}
