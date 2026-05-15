class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count =0;
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j,m,n);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] mat,int i,int j,int m,int n){
        if(i < 0 || j < 0 || i >= m || j >= n || mat[i][j] != '1'){
            return;
        }
        mat[i][j] = 0;
        dfs(mat,i-1,j,m,n);
        dfs(mat,i,j-1,m,n);
        dfs(mat,i+1,j,m,n);
        dfs(mat,i,j+1,m,n);
    }
}
