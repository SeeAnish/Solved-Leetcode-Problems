class Solution 
{
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        int max = 0;
        for(String word: wordDict) max = Math.max(word.length(), max);
        boolean dp[] = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 1; i <= s.length(); i++)
        {
            for(int j = i-1; j >= 0; j--)
            {
                if(i-j > max) continue;
                if(dp[j] && wordDict.contains(s.substring(j,i)))
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}

//Time Complexity: O(n.m)
//Space Complexity: O(n)