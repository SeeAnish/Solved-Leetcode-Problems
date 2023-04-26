class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] prei = intervals[0];
        result.add(prei);
        for(int[] newi: intervals)
        {
            if(prei[1] >= newi[0]) prei[1] = Math.max(prei[1], newi[1]);
            else 
            {
                prei = newi;
                result.add(prei);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
//Time complexity: O(N log N)
//Space complexity: O(N)