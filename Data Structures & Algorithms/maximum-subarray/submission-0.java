class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int cmax = nums[0];
        int maxsum = nums[0];
        for(int i=1;i<n;i++){
            cmax = Math.max(cmax + nums[i],nums[i]);
            maxsum = Math.max(cmax,maxsum);
        }
        return maxsum;
    }
}
