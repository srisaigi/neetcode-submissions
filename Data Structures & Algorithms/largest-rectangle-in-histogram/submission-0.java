class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max =0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n;i++){
            int curr = (i == n) ? 0 : heights[i];
            while(!st.isEmpty() && curr < heights[st.peek()]){
                int top = st.pop();
                int d = st.isEmpty() ? i : i - st.peek() - 1;
                max = Math.max(max,heights[top] * d);
            }
            st.push(i);
        } 
        return max;
    }
}
