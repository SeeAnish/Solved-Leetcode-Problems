class Solution 
{
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> pathar = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) pathar.offer(i);
        while (pathar.size() != 1) 
        {
            int stone1 = pathar.poll();
            int stone2 = pathar.poll();
            pathar.offer(Math.abs(stone1 - stone2));
        }
        return pathar.poll();    
    }
}