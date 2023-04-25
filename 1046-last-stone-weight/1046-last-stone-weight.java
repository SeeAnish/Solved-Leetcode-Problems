class Solution 
{
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> pathar = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) pathar.add(i);
        while (pathar.size() != 1) 
        {
            int stone1 = pathar.remove();
            int stone2 = pathar.remove();
            pathar.add(Math.abs(stone1 - stone2));
        }
        return pathar.remove();    
    }
}