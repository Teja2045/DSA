class Solution{
        static int dp[][];
        
        public int dfs(int[][] matrix, int i, int j, int current){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || current >= matrix[i][j]){
            return 0;
        }
        if(dp[i][j] != 0){
            return dp[i][j];
        }

        dp[i][j] = Math.max(dp[i][j],1+dfs(matrix,i+1,j,matrix[i][j]));
        dp[i][j] = Math.max(dp[i][j],1+dfs(matrix,i-1,j,matrix[i][j]));
        dp[i][j] = Math.max(dp[i][j],1+dfs(matrix,i,j+1,matrix[i][j]));
        dp[i][j] = Math.max(dp[i][j],1+dfs(matrix,i,j-1,matrix[i][j]));

        return dp[i][j];
    }
    
        public int longestIncreasingPath(int[][] matrix) 
        {
        dp = new int[matrix.length][matrix[0].length];
        int max = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(dp[i][j] == 0)
                {
                    dfs(matrix, i, j, -1);
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }
}
