class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int[] o = new int[m+n];
        int a = 0,b = 0, i = 0;
        while(a < m && b < n)
            o[i++] = nums1[a] < nums2[b] ? nums1[a++] : nums2[b++];
        while(a < m)
            o[i++] = nums1[a++];
        while(b < n)
            o[i++] = nums2[b++];
        for(int j = 0; j < o.length; j++) nums1[j] = o[j];
    }
}