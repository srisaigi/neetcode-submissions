class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left =0;
        int right = n -1;
        int top = 0;
        int bottom = m-1;
        List<Integer> a = new ArrayList<>();
        while(top <= bottom && left <= right){
            if(top <= bottom){
                for(int i=left;i<=right;i++){
                a.add(matrix[top][i]);
                }
                top++;
            }
            if(left <= right){
                for(int i=top;i<=bottom;i++){
                    a.add(matrix[i][right]);
                }
                right--;
            }
            if(top <= bottom){
                for(int i=right;i>=left;i--){
                    a.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    a.add(matrix[i][left]);
                }
                left++;
            }
        }
        return a;
    }
}
