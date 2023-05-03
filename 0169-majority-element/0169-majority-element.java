class Solution 
{
    public int majorityElement(int[] nums) 
    {
        if(nums.length == 1) return nums[0];
        int n = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums)
        {
            if(map.containsKey(num) && map.get(num) + 1 > n) return num;
            else map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return -1;
    }
}