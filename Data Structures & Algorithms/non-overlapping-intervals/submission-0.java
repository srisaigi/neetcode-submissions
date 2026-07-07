class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
            int n = intervals.length;
            Arrays.sort(intervals,(a,b) -> a[1] - b[1]);
            int count = 1;
            int l = intervals[0][1];
            int i =1;
            while(i < n){
                if(l <= intervals[i][0]){
                    count++;
                    l = Math.max(l,intervals[i][1]);
                }
                    i++;
            }
            return n - count;
    }
}
