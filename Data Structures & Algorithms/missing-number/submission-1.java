class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int l =0;
        int r = n - 1;
        Arrays.sort(nums);
        while(l <= r){
            int mid = l + (r - l)/2;
            int num = nums[mid] - mid;
            if(num >= 1){
                r = mid-1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
}
