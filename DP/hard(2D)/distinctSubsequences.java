class Solution {
    
    int dp[][];
    
    int solve(int i, int j, String s, String t)
    {
        if(i==s.length()&&j==t.length())
            return 1;
        if(j==t.length())
            return 1;
        if(i==s.length())
            return 0;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        if(s.charAt(i)==t.charAt(j))
            dp[i][j] = solve(i+1,j+1,s,t)+solve(i+1,j,s,t);
        else
            dp[i][j] = solve(i+1,j,s,t);
        return dp[i][j];
    }
    
    public int numDistinct(String s, String t) {
        
        dp = new int[s.length()][t.length()];
        
        for(int x[]:dp)
            Arrays.fill(x,-1);
        return solve(0,0,s,t);
    }
}
