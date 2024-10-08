class Solution {
    public int solve(int i,int j,int m ,int n,int[][] dp)
    {
        if(i>=m || j>=n)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==m-1 && j==n-1)return 1;
        else return dp[i][j]= solve(i+1,j,m,n,dp)+solve(i,j+1,m,n,dp);
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        Arrays.fill(dp[i],-1);
        return solve(0,0,m,n,dp);
    }
}