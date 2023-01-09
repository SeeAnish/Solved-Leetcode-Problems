class Solution 
{
    public String longestPalindrome(String s) 
    {
        String result = "";
        if(s == null || s.length() == 0) return "";
        for(int i = 0; i < s.length(); i++)
        {
            String oddlength = helper(s, i, i);
            String evenlength = helper(s, i, i+1);
            String temp = oddlength.length() > evenlength.length() ? oddlength : evenlength;
            result = result.length() > temp.length() ? result : temp;
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