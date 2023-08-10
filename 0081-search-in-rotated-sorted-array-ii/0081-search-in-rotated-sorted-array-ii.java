class Solution
{
    public boolean search(int[] nums, int target) 
    {
        if(nums.length == 0 || nums == null) return false;
        int left = 0, right = nums.length-1;
        while(left <= right)
        {
            int mid = left + (right- left)/2;
            if(nums[mid] == target) return true;
            else if(nums[left] == nums[mid]) left++;
            else if(nums[left] <= nums[mid])
            {
                if(target < nums[left] || target > nums[mid]) left = mid + 1;
                else right = mid - 1;
            }
            else 
            {
                if(target < nums[mid] || target > nums[right]) right = mid - 1;
                else left = mid + 1;
            }
        }
        return false;
    }
}
//Time Complexity: O(Log n);
//Space Complexity: O(1);