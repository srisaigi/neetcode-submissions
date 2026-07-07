class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        List<int[]> arr = new ArrayList<>();
        int f = intervals[0][0];
        int l = intervals[0][1];
        for(int i=1;i<n;i++){
            if(l >= intervals[i][0]){
                l = Math.max(l,intervals[i][1]);
            }
            else{
                arr.add(new int[]{f,l});
                f = intervals[i][0];
                l = intervals[i][1];
            }
        }
        arr.add(new int[]{f,l});
        int[][] b = new int[arr.size()][2];
        int idx =0;
        for(int[] num : arr){
            b[idx][0] = num[0];
            b[idx][1] = num[1];
            idx++;
        }
        return b;
    }
}
