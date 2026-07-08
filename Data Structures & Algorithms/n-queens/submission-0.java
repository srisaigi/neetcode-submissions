class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> b = new ArrayList<>();
        List<String> a = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                board[i][j] = '.';
            }
        }
        dfs(b,board,n,0);
        return b;
    }
    private void dfs(List<List<String>> b,char[][] board,int n,int row){
        if(row == n){
            List<String> a = new ArrayList<>();
            for(int i=0;i<n;i++){
                a.add(new String(board[i]));
            }
            b.add(a);
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 'Q';
                dfs(b,board,n,row+1);
                board[row][col] = '.';
            }
        }
    }
    private boolean isSafe(char[][] board,int row,int col,int n){
        for(int i=0;i<n;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row - 1,j = col -1;i>=0 && j >=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i= row-1,j = col+1;i >= 0 && j < n;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
