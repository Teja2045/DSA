class Solution {
    int dp[][];
    static int sum;
    int solve(int index, int[]nums, int check, int target)
    {
        if(index == nums.length)
        {
            if(check == target)
                return 1;
            return 0;
        }
        if(dp[index][check+sum]!=-1)
            return dp[index][check+sum];
        
       return dp[index][check+sum] = solve(index+1,nums,check+nums[index],target)+solve(index+1,nums,check-nums[index],target);
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        sum=0;
        for(int x:nums)
            sum+=x;
        dp = new int[nums.length][2*sum+1];
        for(int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],-1);
        return solve(0,nums,0,target);
    }
}
