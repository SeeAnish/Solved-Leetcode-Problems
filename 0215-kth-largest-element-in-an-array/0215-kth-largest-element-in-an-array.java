class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<>();
        for(int num: nums)
        {
            heap.add(num);
            if(heap.size() > k) heap.remove();
        }
        return heap.peek();
    }
}
//Time Complexity: O(n.logK);
//Space Complexity: O(k);