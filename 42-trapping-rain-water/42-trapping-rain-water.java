class Solution 
{
    public int trap(int[] height) 
    {
        int[] left = new int[height.length], right = new int[height.length];
        int sum = 0, max = height[0];
        for(int i = 0; i < height.length; i++) 
        {
            left[i] = Math.max(max, height[i]);
            max = left[i];
        }
        max = height[height.length-1];
        for(int i = height.length-1; i >= 0; i--)
        {
            right[i] = Math.max(max, height[i]);
            max = right[i];
        }
        for(int i = 0; i < height.length; i++)
        {
            int temp = Math.min(left[i], right[i]) - height[i];
            if(temp >= 0) sum += temp;
        }
        return sum;
    }
}