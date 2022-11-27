class Solution {
    public int pivotInteger(int n) {
        int total = (n * (n+1))/2;
        for(int i = 0, ans = 0; i <= n; ++i)
        {
            total -= i; 
            if(ans == total) return i;
            else if( ans > total) return -1;
            ans += i;
        }
        return -1;
    }
}