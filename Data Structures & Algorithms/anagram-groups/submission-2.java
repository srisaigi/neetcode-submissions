class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> b = new ArrayList<>();
        boolean[] visited = new boolean[n];
       HashMap<String,List<String>> mp = new HashMap<>();
       for(String str : strs){
            String res = check(str);
            mp.putIfAbsent(res,new ArrayList<>());
            mp.get(res).add(str);
       }
       for(List<String> str : mp.values()){
        b.add(str);
       }
       return b;
    }
    private String check(String str){
            char[] st = str.toCharArray();
            Arrays.sort(st);
        return new String(st);
    }
}
