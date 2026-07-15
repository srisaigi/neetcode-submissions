class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        int idx =0;
        int[] ans = new int[n];
        Arrays.fill(ans,0);
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int top = st.pop();
                ans[top] = i - top;
            }
            st.push(i);
        }
        return ans;
    }
}
