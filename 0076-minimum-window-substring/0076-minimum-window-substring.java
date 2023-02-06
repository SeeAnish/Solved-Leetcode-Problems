class Solution 
{
    public String minWindow(String s, String t) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        int left = 0, counter = 0, ministr = s.length() + 1, start = 0;
        for(int right = 0; right < s.length(); right++) 
        {
            char current = s.charAt(right);
            if (map.containsKey(current)) 
            {
                map.put(current, map.get(current) - 1);
                if (map.get(current) == 0) counter++;
            }
            while (counter == map.size()) 
            {
                int length = right - left + 1;
                if (ministr > length) 
                {
                    ministr = length;
                    start = left;
                }
                char remove = s.charAt(left++);
                if (map.containsKey(remove)) 
                {
                    if (map.get(remove) == 0) counter--;
                    map.put(remove, map.get(remove) + 1);
                }
            }
        }
        return ministr > s.length() ? "" : s.substring(start, start + ministr);
    }
}
