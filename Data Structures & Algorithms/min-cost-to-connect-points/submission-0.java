class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int total =0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        pq.add(new int[]{0,0});
        boolean[] vis = new boolean[n];
        while(!pq.isEmpty()){
            int[] node = pq.poll();
            int u = node[0];
            int w = node[1];
            if(vis[u]){
                continue;
            }
            total = total + w;
            vis[u] = true;
            for(int v = 0;v < n;v++){
                int cost = Math.abs(points[u][0] - points[v][0]) + Math.abs(points[u][1] - points[v][1]);
                pq.add(new int[]{v,cost});
            }
        }
        return total;
    }
}
