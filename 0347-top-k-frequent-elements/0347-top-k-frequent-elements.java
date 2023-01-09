class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) map.put(i, map.getOrDefault(i, 0) + 1);
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i = 0; i < bucket.length; i++) bucket[i] = new ArrayList<>();
        for(int i: map.keySet()) bucket[map.get(i)].add(i);
        List<Integer> flattened = new ArrayList<>();
        for(int i = bucket.length-1; i >= 0; i--) for(int num: bucket[i]) flattened.add(num);
        int[] result = new int[k];
        for(int i = 0; i < k; i++) result[i] = flattened.get(i);
        return result;
    }
}