class Solution 
{
    public String longestPalindrome(String s) 
    {
        String result = "";
        if(s == null || s.length() == 0) return "";
        for(int i = 0; i < s.length(); i++)
        {
            String tmp = helper(s, i, i);
            if(tmp.length() > result.length()) result = tmp;
            tmp = helper(s, i, i+1);
            if(tmp.length() > result.length())
                result = tmp;
        }
        return result;
    }
    private String helper(String s, int left, int right)
    {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}