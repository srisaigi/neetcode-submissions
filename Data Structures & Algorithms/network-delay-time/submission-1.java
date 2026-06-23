class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : times){
            adj.get(e[0]).add(new int[]{e[1],e[2]});
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] =0;
         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
         pq.add(new int[]{k,0});
        while(!pq.isEmpty()){
            int[] curr= pq.poll();
            int node = curr[0];
            int d = curr[1];
            if(d > dist[node]){
                continue;
            }
            for(int[] nei : adj.get(node)){
                int next = nei[0];
                int w = nei[1];
                if(dist[next] > w + dist[node]){
                    dist[next] = dist[node] + w;
                    pq.add(new int[]{next,dist[next]});
                }
            }
        }
        int ans =0;
        for(int i=1;i<=n;i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }
            ans = Math.max(ans,dist[i]);
        }
        return ans;
    }
}
