class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
            int n = hand.length;
            Arrays.sort(hand);
            HashMap<Integer,Integer> mp = new HashMap<>();
            for(int num : hand){
                mp.put(num,mp.getOrDefault(num,0)+1);
            }
            int req = n / groupSize;
            if(n % groupSize != 0){
                return false;
            }
            int num = hand[0];
            for(int i=0;i<req;i++){
            for(int j=0;j<groupSize;j++){
                if(!mp.containsKey(num)){
                    return false;
                }
                else{
                    mp.put(num,mp.get(num) - 1);
                    if(mp.get(num) == 0){
                         mp.remove(num);
                    }
                    num++;
                }
                }
                num = check(mp);
            }
            return true;
    }
        private int check(HashMap<Integer,Integer> mp){
            int min =  Integer.MAX_VALUE;
            for(int num : mp.keySet()){
                min = Math.min(min,num);
            }
            return min;
        }
}
