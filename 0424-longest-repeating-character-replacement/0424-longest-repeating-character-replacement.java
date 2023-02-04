class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        int[] alpha = new int[26];
        int start = 0, result = 0, frequency = 0;
        for(int end = 0; end < s.length(); end++)
        {
            alpha[s.charAt(end) - 'A']++;
            frequency = Math.max(frequency, alpha[s.charAt(end) - 'A']);
            if(!(end - start - frequency + 1 <= k)) alpha[s.charAt(start++) - 'A']--;
            result = end - start + 1;
        }
        return result;
    }
}