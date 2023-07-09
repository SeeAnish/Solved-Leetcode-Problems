class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        subset(0, nums, result, new ArrayList<>());
        return result;
    }
    public void subset(int index, int[] nums, List<List<Integer>> output, List<Integer> curr)
    {
        output.add(new ArrayList<>(curr));
        for(int i = index; i < nums.length; i++)
        {
            curr.add(nums[i]);
            subset(i+1, nums, output, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
//Time Complexity: O((2^N)*N);
//Space Complexity: O(N)