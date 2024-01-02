class Solution 
{
    public List<List<Integer>> findMatrix(int[] nums) 
    {
        int num[] = new int[nums.length + 1];
        List<List<Integer>> result = new ArrayList<>();
        for(int i: nums)
        {
            if(num[i] >= result.size())
                result.add(new ArrayList<>());
            result.get(num[i]).add(i);
            num[i]++;
        }
        return result;
    }
}
//Time complexity: O(N)
// Space Complexity: O(N)