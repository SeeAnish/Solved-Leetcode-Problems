class Solution 
{
    public int trap(int[] height) 
    {
        if (height.length == 0 || height == null) return 0;
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int sum = 0;
        while (left < right) 
        {
            if (leftMax < rightMax) 
            {
                leftMax = Math.max(leftMax, height[++left]);
                sum += leftMax - height[left];
            } else 
            {
                rightMax = Math.max(rightMax, height[--right]);
                sum += rightMax - height[right];
            }
        }
        return sum;
    }
}