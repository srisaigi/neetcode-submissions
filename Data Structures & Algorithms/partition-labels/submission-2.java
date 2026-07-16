class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        int prev = 0;
        int max =0;
        List<Integer> a = new ArrayList<>();
        for(int i =0;i<n;i++){
            char c = s.charAt(i);
            max = Math.max(max,s.lastIndexOf(c));
            if(i == max){
                String str = s.substring(prev,i+1);
                a.add(str.length());
                prev = i+1;
                max = 0;
            }
        }
        return a;
    }
}
