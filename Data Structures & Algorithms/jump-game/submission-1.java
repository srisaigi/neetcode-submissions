class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int curr = 0;
        if(n == 1){
            return true;
        }
        for(int i=0;i<n-1;i++){
            if(i > curr){
                return false;
            }
         curr = Math.max(curr,i + nums[i]);
         if(curr >= n-1){
            return true;
         }
        }
        return false;
    }
}
