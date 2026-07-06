class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;
        Arrays.sort(candidates);
        List<List<Integer>> b = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        dfs(b,a,0,target,candidates,n);
        return b;
    }
    private void dfs(List<List<Integer>> b,List<Integer> a,int idx,int target,int[] nums,int n){
        if(target == 0){
            b.add(new ArrayList<>(a));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i=idx;i<n;i++){
            if(i > idx && nums[i] == nums[i-1]){
                continue;
            }
            a.add(nums[i]);
            dfs(b,a,i+1,target - nums[i],nums,n);
            a.remove(a.size() - 1);
        }
    }
}
