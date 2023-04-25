class Solution 
{
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) maxheap.add(i);
        while (maxheap.size() != 1) 
        {
            int stone1 = maxheap.poll();
            int stone2 = maxheap.poll();
            maxheap.add(Math.abs(stone1 - stone2));
        }
        return maxheap.poll();     
    }
}

//Time complexity: O(Nlog N)
// Space complexity: O(N)
