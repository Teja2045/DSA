class Solution {
    public int lengthOfLIS(int[] nums) {
        int max[] = new int[nums.length];
        int res = 1;
        Arrays.fill(max,1);
        for(int i=nums.length-2;i>=0;i--)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<nums[j])
                {
                    max[i] = Math.max(max[i],1+max[j]);
                }
            }
            res = Math.max(max[i],res);
        }
        return res;
    }
}
