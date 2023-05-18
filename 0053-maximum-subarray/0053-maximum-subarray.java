class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int curr = 0, max = Integer.MIN_VALUE;
        for(int i: nums)
        {
            curr = Math.max(i + curr, i);
            max = Math.max(max, curr);
        }
        return max;
    }
}
//Time complexity: O(N)
//Space complexity: O(1)