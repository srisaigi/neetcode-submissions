class Solution {
    public boolean checkInclusion(String s1, String s2) {
            int m = s1.length();
            int n = s2.length();
            char[] c = s1.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            int l = 0;
            int r = m-1;
        while(r < n){
            String st1 = s2.substring(l,r+1);
            char[] ca = st1.toCharArray();
            Arrays.sort(ca);
            String st2 = new String(ca);
            if(st2.equals(str)){
                return true;
            }
            l++;
            r++;
        }
        return false;
    }
}
