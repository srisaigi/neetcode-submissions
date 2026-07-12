class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int max =1;
        int count =1;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]+1){
                count++;
            }
            else if(nums[i-1] == nums[i]){
                continue;
            }
            else{
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
