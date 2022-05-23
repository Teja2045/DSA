class Solution {
    int dp[][];
    int arr[];
    
    int solve(int i, int j)
    {
        if(i>j)
            return 0;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        
        int max = -1;
        for(int x=i;x<=j;x++)
        {
            int temp = solve(i,x-1)+solve(x+1,j)+arr[i-1]*arr[x]*arr[j+1];
            
           max = Math.max(max,temp);
        }
        return dp[i][j] = max;
        
    }
    
    public int maxCoins(int[] nums) {
        arr = new int[nums.length+2];
        arr[0] = 1;
        arr[arr.length-1] = 1;
        for(int i=0;i<nums.length;i++)
            arr[i+1] = nums[i];
        dp = new int[arr.length][arr.length];
        for(int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],-1);
        return solve(1,arr.length-2);
    }
}
