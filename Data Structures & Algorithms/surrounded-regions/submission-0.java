class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            dfs(board,i,0,m,n);
            dfs(board,i,n-1,m,n);
        }
        for(int i=0;i<n;i++){
            dfs(board,0,i,m,n);
            dfs(board,m-1,i,m,n);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '#'){
                        board[i][j] = 'O';
                    }
                }
            }
    }
    private void dfs(char[][] mat,int i,int j,int m,int n){
        if(i < 0 || j < 0 || i >= m || j >= n || mat[i][j] != 'O'){
            return;
        }
        mat[i][j] = '#';
        dfs(mat,i-1,j,m,n);
        dfs(mat,i,j-1,m,n);
        dfs(mat,i+1,j,m,n);
        dfs(mat,i,j+1,m,n);
    }
}
