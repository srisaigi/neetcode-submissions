class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> b = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        boolean[] vis = new boolean[n];
        dfs(b,a,vis,n,nums);
        return b;
    }
    private void dfs(List<List<Integer>> b,List<Integer> a,boolean[] vis,int n,int[] nums){
        if(a.size() == n){
            b.add(new ArrayList<>(a));
            return;
        }
        for(int i=0;i<n;i++){
            if(vis[i]){
            continue;
        }
        vis[i] = true;
            a.add(nums[i]);
            dfs(b,a,vis,n,nums);
            vis[i] = false;
            a.remove(a.size() - 1);
    }
    }
}
