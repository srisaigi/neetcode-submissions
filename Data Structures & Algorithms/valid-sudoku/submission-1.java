class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                char num = board[i][j];
                if(num == '.'){
                    continue;
                }
                if(!check1(board,i,j,num) || !check2(board,i,j,num)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean check1(char[][] board,int a,int b,char num){
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<9;i++){
            if(i != a && board[i][b] == num){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(i != b && board[a][i] == num){
                return false;
            }
        }
        return true;
    }
    private boolean check2(char[][] board,int a,int b,char num){
        int x = a - a%3;
        int y = b - b %3;
        for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
                if(i != a && j != b && board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
