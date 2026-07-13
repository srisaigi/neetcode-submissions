class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> 
        ((b[0] * b[0]) + (b[1] * b[1])) - ((a[0] * a[0]) + (a[1] * a[1])));
        for(int i=0;i<n;i++){
            pq.add(new int[]{points[i][0],points[i][1]});
            while(pq.size() > k){
                pq.poll();
            }
        }
        int[][] res = new int[k][2];
        int idx =0;
        while(!pq.isEmpty()){
            int[] top = pq.peek();
            res[idx][0] = top[0];
            res[idx][1] = top[1];
            pq.poll();
            idx++;
        }
        return res;
    }
}