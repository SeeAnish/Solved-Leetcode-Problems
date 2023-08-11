class Solution 
{
    public int coinChange(int[] coins, int amount) 
    {
        if(coins.length == 0 || coins == null) return -1;
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++)
            for(int j = 0; j < coins.length; j++)
                if(coins[j] <= i) 
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
        return amount >= dp[amount] ? dp[amount] : -1;
    }
}
//Time complexity: O(N*amount);
//Space Complexiy: O(amount);