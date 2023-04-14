class Solution 
{
    public void nextPermutation(int[] nums) 
    {
        int pivot = nums.length - 1;
        while(pivot >=1 && nums[pivot] <= nums[pivot-1]) pivot--;
        if(pivot != 0)
        {
            int i = nums.length-1;
            while(nums[i] <= nums[pivot-1]) i--;
            swap(nums, i, pivot-1);
        }
        int left = pivot;
        int right = nums.length -1;
        while(left < right) swap(nums, left++, right--);
    }
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//Time complexity: O(n)
//Space complexity: O(1)