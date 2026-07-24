class Solution {
    public String foreignDictionary(String[] words) {
        int n = words.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<26;i++){
            adj.add(new ArrayList());
        }
        boolean[] used = new boolean[26];
        int[] indegree = new int[26];
        for(String str : words){
            for(char c : str.toCharArray()){
                used[c - 'a'] = true;
            }
        }
        for(int i=0;i<n-1;i++){
            char[] edge = check(words[i],words[i+1]);
            if(edge == null){
                if(words[i].length() > words[i+1].length() && words[i].startsWith(words[i+1])){
                    return "";
                }
                continue;
            }
            int u = edge[0] - 'a';
            int v = edge[1] - 'a';
            indegree[v]++;
            adj.get(u).add(v);
        }
        Queue<Integer> q = new LinkedList<>();
        int total =0;
        for(int i=0;i<26;i++){
            if(used[i]){
                total++;
                if(indegree[i] == 0){
                    q.add(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int count =0;
        while(!q.isEmpty()){
            int node = q.poll();
            sb.append((char)(node + 'a'));
            count++;
            for(int nei : adj.get(node)){
                indegree[nei]--;
                if(indegree[nei] == 0){
                    q.add(nei);
                }
            }
        }
        if(count != total){
            return "";
        }
        return sb.toString();
    }
    private char[] check(String str1,String str2){
        int m = str1.length();
        int n = str2.length();
        if(m > n && str1.startsWith(str2)){
            return null;
        }
        int len = Math.min(m,n);
        for(int i=0;i<len;i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return new char[]{str1.charAt(i),str2.charAt(i)};
            }
        }
        return null;
    }
}
