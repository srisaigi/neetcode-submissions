class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            int diff = nums[i] - nums[i-1];
            if(diff ==0){
                return true;
            }
        }
        return false;
    }
}