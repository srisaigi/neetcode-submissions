class Solution {
    private final int INF = 2147483647; 
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dirs = {{1,0},{-1,0},{0,-1},{0,1}};
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j] == 0){
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
            int[] node = q.poll();
            int x = node[0];
            int y = node[1];
            for(int[] d : dirs){
               int nr = x + d[0];
               int nc = y + d[1];
               if(nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] == INF){
                    q.add(new int[]{nr,nc});
                     grid[nr][nc] = grid[x][y] +1;
               }
            }
        }
    }
    }
}
