/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
            int n = intervals.size();
            List<int[]> res = new ArrayList<>();
            if(n <= 1){
                return true;
            }
            for(Interval r : intervals){
               res.add(new int[]{r.start,r.end});
            }
            Collections.sort(res, (a,b) -> a[0] - b[0]);
            int prev = res.get(0)[1];
            for(int i=1;i<n;i++){
                if(prev > res.get(i)[0]){
                    return false;
                }
                prev = res.get(i)[1];
            }
            return true;
    }
}
