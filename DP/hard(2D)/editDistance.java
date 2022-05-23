class Solution {
    
    int dp[][];
    
    int solve(int i, int j, String s, String t)
    {
        if(i==s.length() && j==t.length())
            return 0;
        if(j==t.length())
            return s.length()-i;
        if(i==s.length())
            return t.length()-j;
        if(dp[i][j]!=Integer.MAX_VALUE)
            return dp[i][j];
        if(s.charAt(i)==t.charAt(j))
            dp[i][j] = solve(i+1,j+1,s,t);
        else
        {
            dp[i][j] = Math.min(dp[i][j],1+solve(i+1,j+1,s,t));
            dp[i][j] = Math.min(dp[i][j],1+solve(i+1,j,s,t));
            dp[i][j] = Math.min(dp[i][j],1+solve(i,j+1,s,t));
        }
        return dp[i][j];
            
    }
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];
        for(int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        return solve(0,0,word1,word2);
    }
}
