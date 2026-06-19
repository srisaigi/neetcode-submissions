class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
             int n = prerequisites.length;
        int count =0; 
        int[] topo = new int[numCourses];
        int idx =0;  
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int[] e : prerequisites){
            int a = e[0];
            int b = e[1];
            indegree[a]++;
            adj.get(b).add(a);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i] == 0){
                topo[idx++] = i;
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int nei : adj.get(node)){
                indegree[nei]--;
                if(indegree[nei] == 0){
                    topo[idx++] = nei;
                    q.add(nei);
                }
            }
        }
        if(count != numCourses){
            return new int[]{};
        }
        return topo;
    }
}
