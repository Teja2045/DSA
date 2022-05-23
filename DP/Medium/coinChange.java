class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp,9999);
        dp[0]=0;
        for(int i=1;i<dp.length;i++)
        {
            for(int j=0;j<coins.length;j++)
            {
                if(i-coins[j]>=0)
                    dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
            }
        }
        return dp[amount]==9999?-1:dp[amount];
    }
}
