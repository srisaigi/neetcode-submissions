class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int time =0;
        int fresh =0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        if(fresh == 0){
            return 0;
        }
        int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
         while(!q.isEmpty() && fresh > 0){
            int size = q.size();
            for(int i=0;i<size;i++){
            int[] curr = q.poll();
            for(int[] dir : dirs){
                int x = curr[0] + dir[0];
                int y = curr[1] + dir[1];
                if(x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 1){
                    grid[x][y] = 2;
                    fresh--;
                    q.offer(new int[]{x,y});
                }
            }
            }
             time++;
         }
         return fresh == 0 ? time : -1;
    }
}
