class Solution {
    
    static Boolean dp[];
    public boolean wordBreak(String s, List<String> wordDict)
    {
        dp = new Boolean[s.length()+1];
        Arrays.fill(dp,null);
       return solve(0,s,wordDict);
    
    }
    
    public boolean solve(int index, String s, List<String> wordDict)
    {
         boolean check = false;
         
         if(dp[index]!=null)
             return dp[index];
         
         if(index== s.length())
         {
             dp[index] = true;
             return true;
         }
         
         for(String x:wordDict)
         {
             if(s.length()>=index+x.length() && x.equals(s.substring(index,index+x.length())))
             {
                 check = solve(index+x.length(),s,wordDict);
             }
             if(check)
                 break;
         }
         
         dp[index] = check;
            return check;
         
    }

}
