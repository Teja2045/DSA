class Solution 
{
    public boolean canPartition(int[] nums)
    {
        if(nums.length==1)
            return false;
        Set<Integer>st = new HashSet<>();
        int sum = 0;
        for(int x:nums)
            sum += x;
        if(sum%2 == 1)
            return false;
        sum = sum/2;
        if(nums[0] == sum)
            return true;
        st.add(0);
        for (int x:nums)
        {
            Set<Integer> tempSet = new HashSet<Integer>(st);
            for (Integer y:tempSet)
            {
                if (x+y == sum) 
                    return true;
                if (x+y < sum)
                    st.add(x+y);
            } 
        }
        return false;
    }
}
