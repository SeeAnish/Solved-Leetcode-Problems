class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int longest_streak = 0;
        Set<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);
        for(int i: set)
        {
            if(!set.contains(i-1))
            {
                int currentnum = i;
                int currentstreak = 1;
                while(set.contains(currentnum+1))
                {
                    currentnum++;
                    currentstreak++;
                }
                longest_streak = Math.max(longest_streak, currentstreak);
            }
        }
        return longest_streak;
    }
}