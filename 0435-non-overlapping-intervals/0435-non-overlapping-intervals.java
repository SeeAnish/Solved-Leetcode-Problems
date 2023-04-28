class Solution 
{
    public int eraseOverlapIntervals(int[][] intervals) 
    {
        if(intervals.length <= 1) return 0;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int answer = -1;
        List<int[]> result = new ArrayList<>();
        int[] prei = intervals[0];
        result.add(intervals[0]);
        for(int[] newi: intervals)
        {
            if(prei[1] <= newi[0])
            {
                prei = newi;
                result.add(prei);
            }
            else 
            {
                answer++;
                prei[1] = Math.min(prei[1], newi[1]);
            }
        }
        return answer;
    }
}