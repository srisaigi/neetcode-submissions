class Solution {
        HashMap<String,Integer> mp = new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        return dfs(nums,0,0,n,target);
    }
    private int dfs(int[] nums,int csum,int idx,int n,int target){
        if(idx == n){
           return csum == target ? 1 : 0;
        }
        String key = idx + "," + csum;
        if(mp.containsKey(key)){
            return mp.get(key);
        }
        int min = dfs(nums,csum - nums[idx],idx+1,n,target);
        int max = dfs(nums,csum + nums[idx],idx+1,n,target);
        mp.put(key,min + max);
        return mp.get(key);
    }
}
