class Solution 
{
    public int trap(int[] height) 
    {
        int sum = 0, left = 0, right = height.length - 1,
        leftmax = height[left], rightmax = height[right];
        while(left < right)
        {
            if(leftmax < rightmax)
            {
                leftmax = Math.max(leftmax, height[++left]);
                sum += leftmax - height[left];
            }
            else
            {
                rightmax = Math.max(rightmax, height[--right]);
                sum += rightmax - height[right];
            }
        }
        return sum;
    }
}
//Time Complexity: O(N);
//Space Complexity: O(1);