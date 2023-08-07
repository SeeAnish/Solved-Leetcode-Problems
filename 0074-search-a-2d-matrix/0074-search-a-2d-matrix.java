class Solution
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int row = matrix.length, col = matrix[0].length, left = 0, right = row * col - 1;
        while(left <= right)
        {
            int mid = left + (right - left)/2, 
            midval = matrix[mid/col][mid%col];
            if(midval == target) return true;
            else if(midval < target) left = mid+1;
            else right = mid - 1;
        }
        return false;
    }
}
//Time complexity: O(log(m*n));
//Space Complexity: O(1);