class Solution 
{
    List<List<String>> result = new ArrayList<>();
    List<String> curr = new ArrayList<>();
    public List<List<String>> partition(String s) 
    {
        backTrack(0, s);
        return result;
    }
    public void backTrack(int start, String s)
    {
        if(start == s.length()) result.add(new ArrayList<>(curr));
        for(int i = start; i < s.length(); i++)
        {
            if(isPalindrome(start, i, s))
            {
                curr.add(s.substring(start, i+1));
                backTrack(i+1, s);
                curr.remove(curr.size() - 1);
            }
        }
    }
    public boolean isPalindrome(int left, int right, String s)
    {
        while(left <= right)
            if(s.charAt(left++) != s.charAt(right--)) return false;
        return true;
    }
}
//Time Complexity:O()
//Space Complexity: O()