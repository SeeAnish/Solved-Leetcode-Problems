class Solution 
{
    public void solveSudoku(char[][] board) 
    {
        if(board.length == 0 || board == null) return;
        solve(board);
    }
    private boolean solve(char[][] nums) 
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[0].length; j++)
            {
                if(nums[i][j] == '.')
                {
                    for(char c = '1'; c <= '9'; c++)
                    {
                        if(isvalid(nums, i, j, c)) 
                        {
                            nums[i][j] = c;
                            if(solve(nums)) return true;
                            else nums[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isvalid(char[][] nums, int i, int j, char c)
    {
        for(int k = 0; k < 9; k++)
        {
            if(nums[i][k] != '.' && nums[i][k] == c) return false;
            if(nums[k][j] != '.' && nums[k][j] == c) return false;
            if(nums[3*(i/3)+k/3][3*(j/3)+k%3] != '.' && nums[3*(i/3)+k/3][3*(j/3)+k%3] == c) 
                return false;
        }
        return true;
    }
}
//Time Complexity: O(9*m); m = number of empty cells
//Space Complexity: O(m); 