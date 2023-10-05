class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        List result = new ArrayList<>();
        if(nums.length == 1) return new ArrayList<>(Arrays.asList(nums[0]));
        for(int num: nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        for(int i: map.keySet())
            if(map.get(i) > nums.length/3) result.add(i);
        return result;
    }
}
//Time Complexity: O(N)
//Space Complexity: O(N)