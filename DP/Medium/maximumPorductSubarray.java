class Solution {
    
    int max (int a, int b, int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>c)
            return b;
        else
            return c;
    }
    
    int min (int a, int b, int c)
    {
        if(a<b && a<c)
            return a;
        else if(b<c)
            return b;
        else
            return c;
    }
    
    public int maxProduct(int[] nums) {
        
        int mx=1,mn=1,res=nums[0];
        
        for(int n:nums)
        {
            if(n==0)
            {
                mx = 1;
                mn = 1;
                if(n>res)
                    res = n;
                continue;
            }
                int temp = mx;
                mx = max(n*temp,n*mn,n);
                mn = min(n*temp,n*mn,n);
                if(mx>res)
                    res = mx;
        }
            return res;
    }
}
