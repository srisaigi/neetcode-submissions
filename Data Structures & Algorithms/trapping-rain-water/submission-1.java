class Solution {
    public int trap(int[] height) {
        int n = height.length;
        Stack<Integer> st = new Stack<>();
        int sum =0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && height[st.peek()] < height[i]){
                int bottom = st.pop();
                if(st.isEmpty()){
                    break;
                }
                int left = st.peek();
                int l = i - left - 1;
                int d = Math.min(height[i],height[left]) - height[bottom];
                sum = sum + l * d;
            }
            st.push(i);
        }
        return sum;
    }
}
