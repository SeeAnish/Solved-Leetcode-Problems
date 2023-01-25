class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length-1; i++)
        {
            if(dups.add(nums[i]))
            {
                for(int j = i+1; j <nums.length; j++)
                {
                    int complement = -nums[i] - nums[j];
                    if(map.containsKey(complement) && map.get(complement) == i)
                    {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                    map.put(nums[j], i);
                }
            }
        }
        return new ArrayList(result);
    }
}