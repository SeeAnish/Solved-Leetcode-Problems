class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count = 0, max = 0;
        for(int i: nums)
        {
            if(i == 1) count++;
            else count = 0;
            max = Math.max(count, max);
        }
        return max;
    }
}
//Time Complexity: O(N);
//Space Complexity: O(1);