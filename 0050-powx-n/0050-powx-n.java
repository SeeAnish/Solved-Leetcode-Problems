class Solution 
{
    public double myPow(double x, int n) 
    {
        double res = helper(x, Math.abs(n));
        return n <= 0 ? 1/res : res;
    }
    private double helper(double x, int n)
    {
        if(n == 0) return 1;
        if(x == 0) return 0;
        double res = helper(x*x,n/2);
        return n%2 == 0 ? res : x*res;
    }
}