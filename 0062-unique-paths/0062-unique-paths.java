class Solution 
{
    public int uniquePaths(int m, int n) 
    {
        int[][] matrix = new int[m][n];
        for(int i = 0; i < matrix.length; i++) matrix[i][0] = 1;
        for(int j = 0; j < matrix[0].length; j++) matrix[0][j] = 1;
        for(int i = 1; i < matrix.length; i++)
            for(int j = 1; j < matrix[0].length; j++) 
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
        return matrix[m-1][n-1];
    }
}
// Time Complexity: O(MN)
//Space Complexity: O(MN)