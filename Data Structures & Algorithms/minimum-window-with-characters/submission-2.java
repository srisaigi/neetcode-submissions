class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int l =0;
        int min = Integer.MAX_VALUE;
        int count =0;
        int req = t.length();
        String res = "";
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c : t.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> have = new HashMap<>();
        for(int r =0;r<n;r++){
            char c = s.charAt(r);
            have.put(c,have.getOrDefault(c,0)+1);
            if(freq.containsKey(c) && have.get(c) <= freq.get(c)){
                count++;
            }
            while(count == req){
                if((r - l + 1) < min){
                    min = r - l + 1;
                    res = s.substring(l,r+1);
                }
                char lchar = s.charAt(l);
                have.put(lchar,have.get(lchar) - 1);
                if(freq.containsKey(lchar) && have.get(lchar) < freq.get(lchar)){
                    count--;
                }
                l++;
            }
        }
        return res;
    }
}
