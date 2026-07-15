class MinStack {
        Stack<Integer> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    public int getMin() {
        int min= Integer.MAX_VALUE;
        for(int num : st){
            min = Math.min(min,num);
        }
        return min;
    }
}
