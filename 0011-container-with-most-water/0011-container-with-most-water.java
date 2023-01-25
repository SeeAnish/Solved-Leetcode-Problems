class Solution 
{
    public int maxArea(int[] height) 
    {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i < j)
        {
            int current = 0;
            current = Math.min(height[i], height[j])*Math.abs(i-j);
            max = Math.max(current, max);
            if(height[i] <= height[j]) i++;
            else j--;
        }
        return max;
    }
}