class Solution 
{
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        backtrack(candidates, target, 0);
        return result;
    }
    private void backtrack(int[] nums, int complement, int start)
    {
        if(complement < 0) return;
        else if(complement == 0) result.add(new ArrayList<>(curr));
        else
        {
            for(int i = start; i < nums.length; i++)
            {
                curr.add(nums[i]);
                backtrack(nums, complement - nums[i], i);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
//Time complexity: O(N^target); where N is the number of candidates
//Space COmplexity: O(target);