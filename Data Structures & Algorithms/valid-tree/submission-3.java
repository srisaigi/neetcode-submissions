class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] vis = new boolean[n];
        if(edges.length != n-1){
            return false;
        }
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
                if(!dfs(0,-1,adj,vis)){
                    return false;
                }
            for(int i=0;i<n;i++){
                if(!vis[i]){
                    return false;
                }
            }
        return true;
    }
    private boolean dfs(int node,int parent,List<List<Integer>> adj,boolean[] vis){
        vis[node] = true;
        for(int nei : adj.get(node)){
            if(!vis[nei]){
            if(!dfs(nei,node,adj,vis)){
                return false;
            }
            }
            else if(nei != parent){
                return false;
            }
        }
        return true;
    }
}
