class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> b = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        dfs(b,a,0,target,nums,n);
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
            a.add(nums[i]);
            dfs(b,a,i,target - nums[i],nums,n);
            a.remove(a.size() - 1);
        }
    }
}
