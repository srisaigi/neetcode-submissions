class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int ans = Math.max(check(nums,0,n-2),check(nums,1,n-1));
        return ans;
    }
    private int check(int[] nums,int l,int r){
        int n = r - l + 1;
        if(n == 1){
            return nums[l];
        }
        if(n == 2){
            return Math.max(nums[l],nums[l+1]);
        }
        int[] dp = new int[r+1];
        dp[l] = nums[l];
        dp[l+1] = Math.max(nums[l],nums[l+1]);
        for(int i = l+2;i<=r;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i]);
        }
        return dp[r];
    }
}
