class Solution 
{
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        backtrack(0, target, candidates);
        return result;
    }
    private void backtrack(int start, int complement, int[] nums) 
    {
        if(complement < 0) return;
        else if(complement == 0) result.add(new ArrayList<>(curr));
        else
        {
            for(int i = start; i< nums.length; i++)
            {
                if(i > start && nums[i] == nums[i-1]) continue;
                curr.add(nums[i]);
                backtrack(i+1, complement - nums[i], nums);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
//Time COmplexity: O(Nlog N);
//Space Complexity: O(N);