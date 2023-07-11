class Solution 
{
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    int k;
    public List<List<Integer>> combinationSum3(int k, int n) 
    {
        this.k = k;
        backtrack(1, n);
        return result;
    }
    private void backtrack(int start, int sum)
    {
        if(curr.size() > k) return;
        else if(curr.size() == k && sum == 0)
        {
            result.add(new ArrayList<>(curr));
            return;
        }
        else 
        {
            for(int i = start; i <= 9; i++)
            {
                if(sum - i >= 0)
                {
                    curr.add(i);
                    backtrack(i+1, sum - i);
                    curr.remove(curr.size() - 1);
                }
            }
        }
    }
}
//Time Complexity: O(9^k);
//Space COmplexity: O(K); where k is the target number of elements in each combination