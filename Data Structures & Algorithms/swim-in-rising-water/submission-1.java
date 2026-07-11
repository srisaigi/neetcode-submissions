class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] vis = new boolean[n][n];
        int count = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[]{grid[0][0],0,0});
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int time = curr[0];
            int x = curr[1];
            int y = curr[2];
            if(vis[x][y]){
                continue;
            }
            vis[x][y] = true;
            if(x == n-1 && y == n-1){
                return time;
            }
            for(int[] d : dirs){
                int nr = x + d[0];
                int nc = y + d[1];
                if(nr >= 0 && nc >= 0 && nr < n && nc < n && !vis[nr][nc]){
                    pq.add(new int[]{Math.max(time,grid[nr][nc]),nr,nc});
                }
            }
        }
        return -1;
    }
}
