class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1)/2;
        int total1 = 0;
        for(int num : nums){
            total1 = total1 + num;
        }
        return total - total1;
    }
}
