class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sum = 0;
        int tank =0;
        int start = 0;
        for(int i=0;i<n;i++){
            tank = tank + (gas[i] - cost[i]);
            sum = sum + (gas[i] - cost[i]);
            if(tank < 0){
                start = i + 1;
                tank =0;
            }
        }
        return sum >= 0 ? start % n : -1;
    }
}
