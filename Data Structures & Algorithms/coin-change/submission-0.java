class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,max);
        dp[0] =0;
        for(int i=1;i<=amount;i++){
            for(int num : coins){
                if(num <=i){
                    dp[i] = Math.min(dp[i],dp[i-num] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
