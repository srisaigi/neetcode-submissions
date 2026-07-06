class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int res =0;
        for(String token : tokens){
            if(token.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(a+b);
            }
            else if(token.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.push(b - a);
            }
            else if(token.equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.push(a * b);
                }
            else if(token.equals("/")){
                int a = st.pop();
                int b = st.pop();
                if(a != 0){
                st.push(b / a);
                }
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
