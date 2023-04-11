class Solution {
    public void setZeroes(int[][] matrix) {
        Set row = new HashSet<>();
        Set col = new HashSet<>();
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(row.contains(i) || col.contains(j))
                matrix[i][j] = 0;
            }
        }
    }
}

//Time complexity: O(M x N) where M and N are the row and column of the matrix.
//Space complexity: O(M + N) 