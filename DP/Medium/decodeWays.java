class Solution {
    
    int dp[];
    int solve(int i, String s)
    {
        if(i>=s.length())
            return 1;
        
        if(dp[i]!=-1)
            return dp[i];
        
        if(s.charAt(i)=='0')
            return dp[i] = 0;
        
        if((s.charAt(i)=='1' && i+1<s.length())||(s.charAt(i)=='2' && i+1<s.length() && s.charAt(i+1)>='0' && s.charAt(i+1)<='6'))
            return dp[i]=solve(i+1,s)+solve(i+2,s);
        
        return dp[i]=solve(i+1,s);
        
    }
        
    public int numDecodings(String s) {
        dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(0,s);
    }
}
