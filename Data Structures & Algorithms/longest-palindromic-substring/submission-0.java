class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 0){
            return "";
        }
        int start =0;
        int end =0;
        for(int i=0;i<n;i++){
            int len1 = check(s,i,i);
            int len2 = check(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > (end - start)){
                start = i - (len - 1) / 2;
                end = i + (len) / 2;
            }
        }
        return s.substring(start,end+1);
    }
    private int check(String str,int l,int r){
        int n = str.length();
        while(l >=0 && r < n && str.charAt(l) == str.charAt(r)){
                l--;
                r++;
        }
        return r - l - 1;
    }
}
