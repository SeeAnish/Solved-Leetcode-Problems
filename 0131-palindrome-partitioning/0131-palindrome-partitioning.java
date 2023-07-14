class Solution 
{
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) 
    {
        backTrack(0, s, new ArrayList());
        return result;
    }
    public void backTrack(int start, String s, List<String> curr)
    {
        if(start == s.length())
        {
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i < s.length(); i++)
        {
            if(isPalindrome(start, i, s))
            {
                curr.add(s.substring(start, i+1));
                backTrack(i+1, s, curr);
                curr.remove(curr.size() - 1);
            }
        }
    }
    public boolean isPalindrome(int index, int last, String s)
    {
        while(index < last)
        {
            if(s.charAt(index) != s.charAt(last)) return false;
            index++;
            last--;
        }
        return true;
    }
}
//Time Complexity:O()
//Space Complexity: O()