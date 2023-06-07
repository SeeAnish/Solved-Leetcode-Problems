class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int[] array = new int[nums.length];
        for(int i = 0; i < nums.length; i++) array[(i+k)% nums.length] = nums[i];
        for(int i = 0; i < nums.length; i++) nums[i] = array[i];
        
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n)