class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] temp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[i][j] = matrix[i][j];
            }
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                int num = matrix[i][j];
                int a = i;
                int b = j;
                if(num == 0){
                    while(a >= 0){
                        temp[a][j] = 0;
                        a--; 
                    }
                    a = i;
                    while(a < m){
                        temp[a][j] = 0;
                        a++;
                    }
                    while(b >= 0){
                        temp[i][b] =0;
                        b--;
                    }
                    b = j;
                    while(b < n){
                        temp[i][b] =0;
                        b++;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
}
