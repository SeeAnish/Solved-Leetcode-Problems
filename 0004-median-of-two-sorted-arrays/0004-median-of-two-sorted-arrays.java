class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int A = nums1.length, B = nums2.length, left = 0, right = A, half = (A + B + 1)/2;
        if(A > B) return findMedianSortedArrays(nums2, nums1);
        double result = 0;
        while(left <= right)
        {
            int Amid = left + (right - left)/2, Bmid = half - Amid,
            Aleft = Amid > 0 ? nums1[Amid-1] : Integer.MIN_VALUE,
            Aright = Amid < A ? nums1[Amid] : Integer.MAX_VALUE,
            Bleft = Bmid > 0 ? nums2[Bmid-1] : Integer.MIN_VALUE,
            Bright = Bmid < B ? nums2[Bmid] : Integer.MAX_VALUE;
            if(Aleft <= Bright && Bleft <= Aright)
            {
                if((A + B) % 2 == 0)
                    result = (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
                else result = Math.max(Bleft, Aleft);
                break;
            }
            else if(Aleft > Bright) right = Amid - 1;
            else left = Amid + 1;
        }
        return result;
    }
}
//Time Complexity: O(log(min(A, B)));
//Space Complexity: O(1);