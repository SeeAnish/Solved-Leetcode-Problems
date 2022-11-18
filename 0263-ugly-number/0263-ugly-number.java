class Solution 
{
    public boolean isUgly(int n) 
    {
        if(n >= 1) 
        {
            int ans = pretty(n);
            if(n == 1 || n == 2 || n == 3 || n == 5 || ans == 1) return true;
            else return false;
        }
        return false;
    }
    
    public int pretty(int n)
    {
        while(n != 1)
        {
            if(n%2 == 0) n = n/2;
            else if(n%3 == 0) n = n/3;
            else if(n%5 == 0) n = n/5;
            else return 0;
        }
        return 1;
    }
}