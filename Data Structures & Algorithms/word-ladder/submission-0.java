class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
         int n = wordList.size();
            int count =0;
            Queue<String> q = new LinkedList<>();
            HashSet<String> vis = new HashSet<>();
            HashSet<String> hs = new HashSet<>();
            for(String str : wordList){
                hs.add(str);
            }
            if(!hs.contains(endWord)){
                return 0;
            }
            q.add(beginWord);
            vis.add(beginWord);
            count++;
            while(!q.isEmpty()){
                int size = q.size();
                for(int i=0;i<size;i++){
                    String str = q.poll();
                    if(str.equals(endWord)){
                        return count;
                    }
                    for(String st : wordList){
                        if(check(str,st) && !vis.contains(st)){
                            q.add(st);
                            vis.add(st);
                        }
                    }
                }
                if(q.isEmpty()){
                        return 0;
                    }
                count++;
            }
            return -1;
    }
    private boolean check(String str1,String str2){
        int n = str1.length();
        if(str1.length() != str2.length()){
            return false;
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(str1.charAt(i) != str2.charAt(i)){
                count++;
            }
        }
        return count == 1;
    }
}
