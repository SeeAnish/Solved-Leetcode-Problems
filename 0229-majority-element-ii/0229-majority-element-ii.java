class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> result = new ArrayList<>();
        if(nums.length == 1)
        {
            result.add(nums[0]);
            return result;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums)
        {
            if(map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        for(int i: map.keySet()) if(map.get(i) > nums.length/3) result.add(i);
        return result;
    }
}