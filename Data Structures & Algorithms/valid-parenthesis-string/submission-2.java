class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> starst = new Stack<>();
        if(n == 1){
            if(s.charAt(0) == '*'){
                return true;
            }
            else{
                return false;
            }
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else if(s.charAt(i) == ')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!starst.isEmpty()){
                    starst.pop();
                }
                else{
                    return false;
                }
            }
            else{
                starst.push(i);
            }
        }
        while(!starst.isEmpty() && !st.isEmpty()){
            if(starst.peek() > st.peek()){
                starst.pop();
                st.pop();
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
    }
}
