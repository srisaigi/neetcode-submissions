class Solution {
    public int minEatingSpeed(int[] piles, int h) {
            int n = piles.length;
            int max = Integer.MIN_VALUE;
            for(int num : piles){
                max = Math.max(num,max);
            }
            int l =1;
            int r = max;
            int ans = 0;
            while(l <= r){
                int mid = l + (r - l) / 2;
                if(check(piles,mid,h)){
                    ans = mid;
                    r = mid - 1;
                }
                else{
                    l = mid +1;
                }
            }
            return ans;
    }
        private boolean check(int[] nums,int mid,int k){
            int count =0;
            for(int num : nums){
                count = count + (num + mid - 1) / mid;
            }
            return count <= k;
        }
}
