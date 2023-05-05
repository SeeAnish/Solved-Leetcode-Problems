class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int remainder = target - nums[i];
            if(map.containsKey(remainder))
            {
                result[0] = map.get(remainder);
                result[1] = i;
                return result;
            }
            else map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}