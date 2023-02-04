class Solution 
{
    public int maxProfit(int[] prices) 
    {
        if(prices.length == 0 || prices == null) return 0;
        int current = Integer.MAX_VALUE, max = 0;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < current) current = prices[i];
            else if(prices[i] - current > max) max = prices[i] - current;
        }
        return max;
    }
}