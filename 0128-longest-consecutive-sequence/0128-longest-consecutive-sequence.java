class Solution
{
    public int longestConsecutive(int[] nums) 
    {
        int longs = 0;
        Set<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);
        for(int i: set)
        {
            if(!set.contains(i-1))
            {
                int currs = 0;
                while(set.contains(i))
                {
                    i++;
                    currs++;
                }
                longs = Math.max(currs, longs);
            }
        }
        return longs;
    }
}
//Time Complexity: O(N)
//Space Complexity: O(N)