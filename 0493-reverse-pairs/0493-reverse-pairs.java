public class Solution 
{
    public int reversePairs(int[] A)
    {    
        return invCount(A , 0, A.length - 1);
    }
    public int invCount(int[] A, int left, int right)
    {
        if(left == right) return 0;
        int mid = (left + right) / 2;
        int a = invCount(A , left , mid);
        int b = invCount(A , mid + 1, right);
        int aWithB = mergeSort(A , left , mid, right);
        return a + b + aWithB;
    }
    public int mergeSort(int[] A, int left, int mid, int right)
    {
        int count = 0, i = left, j = mid+1, k = 0;
        int[] C = new int[right - left + 1];
        while(i <= mid && j <= right)
        {
            if((long) A[i] > (long) 2*A[j])
            {
                count += mid-i+1;
                j++;
            }
            else i++;
        }
        i = left;
        j = mid+1;
        while(i <= mid && j <= right)
        {
            if(A[i] <= A[j]) C[k++] = A[i++];
            else C[k++] = A[j++];
        }
        while(i <= mid) C[k++] = A[i++];
        while(j <= right) C[k++] = A[j++];
        k = 0;
        for(int z = left; z <= right; z++, k++) A[z] = C[k];
        return count;
    }
}   