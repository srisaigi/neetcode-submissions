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
    public int minMeetingRooms(List<Interval> intervals) {
            int n = intervals.size();
            List<int[]> res = new ArrayList<>();
            if(n == 0){
                return 0;
            }
            for(Interval r : intervals){
               res.add(new int[]{r.start,r.end});
            }
            Collections.sort(res, (a,b) -> a[0] - b[0]);
            int count = 1;
            int prev = res.get(0)[1];
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(res.get(0)[1]);
            for(int i=1;i<n;i++){
                if(pq.peek() <= res.get(i)[0]){
                    pq.poll();
                }
                pq.add(res.get(i)[1]);
            }
            return pq.size();
    }
}
