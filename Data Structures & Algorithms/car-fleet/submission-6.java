class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] store = new int[n][2];
        Stack<Double> st = new Stack<>();
       for(int i=0;i<n;i++){
        store[i][0] = position[i];
        store[i][1] = speed[i];
       }
       Arrays.sort(store,(a,b) -> b[0] - a[0]);
       for(int i=0;i<n;i++){
        int num = target - store[i][0];
        double x = (double)num / store[i][1];
        if(st.isEmpty() || x > st.peek()){
            st.push(x);
        }
       }
       return st.size();
    }
}
