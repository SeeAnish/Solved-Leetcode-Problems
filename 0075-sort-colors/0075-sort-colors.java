class Solution 
{
    public void sortColors(int[] nums) 
    {
        int left = 0, curr = 0, right = nums.length -1;
        while(curr <= right)
        {
            if(nums[curr] == 0) swap(nums, curr++, left++);
            else if(nums[curr] == 1) curr++;
            else if(nums[curr] == 2) swap(nums, curr, right--);
        }
    }
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}