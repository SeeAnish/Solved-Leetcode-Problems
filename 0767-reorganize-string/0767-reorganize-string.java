class Solution 
{
    public String reorganizeString(String s) 
    {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        Queue<Character> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        heap.addAll(map.keySet());
        if(map.get(heap.peek()) > (s.length() + 1)/2) return "";
        int i = 0;
        char[] result = new char[s.length()];
        while(!heap.isEmpty())
        {
            char c = heap.poll();
            for(int j = 0; j < map.get(c); j++)
            {
                if(i >= s.length()) i = 1;
                result[i] = c;
                i += 2;
            }
        }
        return new String(result);
    }
}
//Time Complexity: O(N);
//Space Complexity:O(N)