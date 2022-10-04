class Solution 
{
    public int trap(int[] height) 
    {
        int[] left = new int[height.length], right = new int[height.length];
        int sum = 0, max = height[0];
        left[0] = height[0];
        right[height.length-1] = height[height.length-1];
        for(int i = 1; i < height.length; i++) left[i] = Math.max(left[i-1], height[i]);
        for(int i = height.length-2; i >= 0; i--) right[i] = Math.max(right[i+1], height[i]);
        for(int i = 0; i < height.length; i++)
        {
            int temp = Math.min(left[i], right[i]) - height[i];
            if(temp >= 0) sum += temp;
        }
        return sum;
    }
}