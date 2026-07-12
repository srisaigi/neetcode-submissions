class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> b = new ArrayList<>();
        boolean[] visited = new boolean[n];
        String[] res = new String[n];
        for(int i=0;i<n;i++){
            char[] st = strs[i].toCharArray();
            Arrays.sort(st);
            res[i] = new String(st);
        }
        for(int i=0;i<n;i++){
            List<String> a = new ArrayList<>();
            if(visited[i]){
                continue;
            }
            a.add(strs[i]);
            visited[i] = true;
            for(int j = i+1;j<n;j++){
                if(!visited[j] && res[i].equals(res[j])){
                    a.add(strs[j]);
                    visited[j] = true;
                }
            }
            b.add(a);
        }
        return b;
    }
}
