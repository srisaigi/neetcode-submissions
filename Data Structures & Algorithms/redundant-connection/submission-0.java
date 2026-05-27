class Solution {
        int[] parent;
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i] = i;
        }
        for(int[] res : edges){
            int a = res[0];
            int b = res[1];
            int pu = find(a);
            int pv = find(b);
            if(pu == pv){
                return res;
            }
            parent[pu] = pv;
        }
        return new int[]{-1,-1};
    }
    private int find(int x){
        if(parent[x] == x){
            return x;
        }
        return parent[x] = find(parent[x]);
    }
}
