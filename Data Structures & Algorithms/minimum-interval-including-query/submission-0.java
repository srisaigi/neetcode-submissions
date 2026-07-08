class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int m = intervals.length;
        int n = queries.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        for(int i=0;i<n;i++){
            ans[i] = check(intervals,queries[i]);
        }
        return ans;
    }
    private int check(int[][] intervals,int num){
        int min = Integer.MAX_VALUE;
        HashSet<int[]> hs = new HashSet<>();
        for(int[] e : intervals){
            int f = e[0];
            int l = e[1];
            if(f <= num && num <= l){
                hs.add(new int[]{f,l});
            }
        }
        if(hs.size() == 0){
            return -1;
        }
        for(int[] e : hs){
            min = Math.min(min,e[1] - e[0] + 1);
        }
        return min;
    }
}
