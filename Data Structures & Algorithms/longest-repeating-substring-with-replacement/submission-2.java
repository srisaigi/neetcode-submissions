class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int l =0;
        int max =0;
        int maxlen =0;
        for(int r=0;r<n;r++){
            char c = s.charAt(r);
            freq[c - 'A']++;
            max = Math.max(max,freq[c - 'A']);
            while(r - l +1 - max > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxlen = Math.max(maxlen,r - l + 1);
        }
        return maxlen;
    }
}
