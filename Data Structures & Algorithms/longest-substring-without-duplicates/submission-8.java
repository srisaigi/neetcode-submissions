class Solution {
    public int lengthOfLongestSubstring(String s) {
            int n = s.length();
            if(n == 0){
                return 0;
            }
            if(n == 1){
                return 1;
            }
            int max = Integer.MIN_VALUE;
            int l=0;
            int count =0;
            HashSet<Character> hs = new HashSet<>();
           int r =0;
           while(r < n){
                char c = s.charAt(r);
            if(!hs.contains(c)){
                hs.add(c);
                max = Math.max(max,r - l + 1);
                r++;
            }
            else{
                    hs.remove(s.charAt(l));
                    l++;
            }
           }
            return max;
    }
}
