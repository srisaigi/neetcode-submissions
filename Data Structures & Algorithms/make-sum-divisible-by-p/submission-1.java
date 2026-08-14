class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int total =0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            total += num;
        }
        if(total % p == 0){
            return 0;
        }
        int rem = total % p;
        mp.put(0,-1);
        int min = n;
        int pre =0;
        for(int i=0;i<n;i++){
            pre = pre + nums[i];
            int mod = (pre) % p;
            int target = (mod - rem + p) % p;
            if(mp.containsKey(target)){
                min = Math.min(min,i - mp.get(target));
            }
                mp.put(mod,i);
        }
        return min == n ? -1 : min;
    }
}