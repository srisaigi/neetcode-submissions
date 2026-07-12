class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> a = new ArrayList<>(mp.keySet());
        Collections.sort(a,(x,y) -> mp.get(y) - mp.get(x));
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = a.get(i);
        }
        //Arrays.sort(res);
        return res;
    }
}
