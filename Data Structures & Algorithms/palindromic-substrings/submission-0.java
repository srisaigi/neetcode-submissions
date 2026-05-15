class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count =0;
        for(int i=0;i<n;i++){
            for(int j =i;j<n;j++){
                String str = s.substring(i,j+1);
                if(check(str)){
                    count++;
                }
            }
        }
        return count;
    }
    private boolean check(String s){
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n - i -1)){
                return false;
            }
        }
        return true;
    }
}
