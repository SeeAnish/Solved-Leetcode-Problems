class Solution 
{
    public int maxProfit(int[] prices) 
    {
        if(prices == null || prices.length == 0) return 0;
        int current = Integer.MAX_VALUE, max = 0;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < current) current = prices[i];
            max = Math.max(max, prices[i] - current);
        }
        return max;
    }
}
//Time complexity: O(N)
//Space complexity: O(1)