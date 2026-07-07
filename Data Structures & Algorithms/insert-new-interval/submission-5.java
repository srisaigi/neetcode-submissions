class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i =0;
        List<int[]> a = new ArrayList<>();
        while(i < n && intervals[i][1] < newInterval[0]){
                a.add(new int[]{intervals[i][0],intervals[i][1]});
                i++;
        }
        while(i < n && intervals[i][0] <= newInterval[1]){
                    newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
                    newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
                    i++;
        }
        a.add(new int[]{newInterval[0],newInterval[1]});
        while(i < n){
            a.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        int[][] b = new int[a.size()][2];
        int idx =0;
        for(int[] num : a){
            b[idx][0] = num[0];
            b[idx][1] = num[1];
            idx++;
        }
        return b;
    }
}
