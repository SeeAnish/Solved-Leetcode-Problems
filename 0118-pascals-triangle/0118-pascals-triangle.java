class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for(int i = 1; i < numRows; i++)
        {
            List<Integer> currow = new ArrayList<>();
            List<Integer> prerow = triangle.get(i-1);
            currow.add(1);
            for(int j = 1; j < prerow.size(); j++) currow.add(prerow.get(j-1) + prerow.get(j));
            currow.add(1);
            triangle.add(currow);
        }
        return triangle;
    }
}
//Time complexity: O(n^2)
//Space complexity:  O(1)
