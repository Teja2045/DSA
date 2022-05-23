class Solution {
    public String longestPalindrome(String s) {
        int l=0,r=0,left,right,length=1;
        for(int i=0;i<s.length();i++)
        {
            left = i-1;
            right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            }right--; left++;
            
            if(right-left+1>length)
            {
                length = right-left+1;
                l = left;
                r = right;
            }
            
            left = i;
            right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            } right--; left++;
            
            if(right-left+1>length)
            {
                length = right-left+1;
                l = left;
                r = right;
            }
        }
        
        return s.substring(l,r+1);
        
        
    }
}
