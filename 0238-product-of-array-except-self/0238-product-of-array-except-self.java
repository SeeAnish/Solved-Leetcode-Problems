class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int[] answer = new int[nums.length];
        int[] result = new int[nums.length];
        answer[0] = 1;
        result[nums.length-1] = 1;
        for(int i = 0; i < nums.length-1; i++) answer[i+1] = answer[i]*nums[i];
        for(int i = nums.length-1; i > 0; i--) result[i-1] = result[i]*nums[i];
        for(int i = 0; i < nums.length; i++) result[i] *= answer[i];
        return result;
    }
}