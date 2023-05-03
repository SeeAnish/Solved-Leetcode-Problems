class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        int candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE; 
        int life1 = 0, life2 = 0, c1 = 0, c2 = 0;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == candidate1) life1++;
            else if(nums[i] == candidate2) life2++;
            else if(life1 == 0) 
            {
                candidate1 = nums[i];
                life1 = 1;
            }
            else if(life2 == 0)
            {
                candidate2 = nums[i];
                life2 = 1;
            }
            else
            {
                life1--;
                life2--;
            }
        }
        for(int i: nums)
        {
            if(candidate1 == i) c1++;
            if(candidate2 == i) c2++;
        }
        if(c1 > nums.length/3) result.add(candidate1);
        if(c2 > nums.length/3) result.add(candidate2);
        return result;
    }
}
//Time Complexity: O(N)
//Space Complexity: O(1)