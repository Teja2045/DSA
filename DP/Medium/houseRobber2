class Solution {
    
    int solve(int[]nums, int i, int j)
    {
        int rob1=0, rob2=0;
        for(int x=i;x<=j;x++)
        {
            int temp = Math.max(nums[x]+rob1,rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
    
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        return Math.max(solve(nums,0,nums.length-2),solve(nums,1,nums.length-1));
    }
}
