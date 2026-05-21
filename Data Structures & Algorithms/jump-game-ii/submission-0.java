class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int curr = 0;
        int far =0;
        int count =0;
        for(int i=0;i<n-1;i++){
            far = Math.max(far,i + nums[i]);
            if(i == curr){
                count++;
                curr = far;
            }
        }
        return count;
    }
}
