class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int total =0;
        for(int num : nums){
            total = total + num;
        }
        if(total % 2 != 0){
            return false;
        }
        int req = total / 2;
        return dfs(nums,0,n,req);
    }
    private boolean dfs(int[] nums,int idx,int n,int req){
        if(req == 0){
            return true;
        }
        if(idx == n || req < 0){
            return false;
        }
        if(req == 0){
            return true;
        }
        if(dfs(nums,idx+1,n,req-nums[idx])){
            return true;
        }
        if(dfs(nums,idx+1,n,req)){
            return true;
        }
        return false;
    }
}
