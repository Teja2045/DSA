class Solution {
    public int climbStairs(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int current=2,before=1;
        for(int i=3;i<=n;i++)
        {
            current=current+before;
            before=current-before;
        }
        return current;
    }
}
