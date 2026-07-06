class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] temp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[i][j] = matrix[j][i];
            }
        }
        for(int i=0;i<m;i++){
                int a =0;
                int b = n -1;
                while(a < b){
                    int res = temp[i][a];
                    temp[i][a] = temp[i][b];
                    temp[i][b] = res;
                    a++;
                    b--;
                }
        }
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
}
