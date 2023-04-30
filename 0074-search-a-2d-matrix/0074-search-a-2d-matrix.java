class Solution
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int i = 0;
        int j = matrix[0].length - 1; // start at the top right corner
        while (i < matrix.length && j >= 0) 
        {
            if (matrix[i][j] == target) return true;
            else if (target < matrix[i][j]) j--; // move left
            else i++; // move down
        }
        return false; // target not found
    }
}
