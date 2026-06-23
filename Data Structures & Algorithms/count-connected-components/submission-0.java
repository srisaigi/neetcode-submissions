class Solution {
    public int countComponents(int n, int[][] edges) {
        int count =0;
        boolean[] vis = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : edges){
            int u = e[0];
            int v = e[1];
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }
    private void dfs(int node,List<List<Integer>> adj,boolean[] vis){
            if(vis[node]){
                return;
            }
            vis[node] = true;
            for(int nei : adj.get(node)){
                dfs(nei,adj,vis);
            }
    }
}
