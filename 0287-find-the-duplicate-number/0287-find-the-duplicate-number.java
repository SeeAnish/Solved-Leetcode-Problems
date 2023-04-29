class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        Set set = new HashSet<>();
        for(int i: nums)
        {
            if(set.contains(i)) return i;
            set.add(i);
        }
        return -1;
    }
}
//Time complexity: O(n);
//Space complexity: O(n);