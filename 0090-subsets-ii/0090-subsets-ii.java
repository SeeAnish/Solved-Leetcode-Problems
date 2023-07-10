class Solution 
{
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        subsets(result, new ArrayList<>(), nums, 0);
        return result;
    }
    private void subsets(List<List<Integer>> output, List<Integer> curr, int[] nums, int index)
    {
        output.add(new ArrayList<>(curr));
        for(int i = index; i < nums.length; i++)
        {
            if(i > index && nums[i] == nums[i-1]) continue;
            curr.add(nums[i]);
            subsets(output, curr, nums, i+1);
            curr.remove(curr.size() - 1);
        }
    }
}
//Time complexity: O((2^n)*N);
//Space Complexity: O(N);