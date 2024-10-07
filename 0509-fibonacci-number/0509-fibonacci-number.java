class Solution {
    public int solve(int n,int[] dp)
    {
        if(n==0)return 0;
        if(n==1)return 1;
        if(dp[n]!=-1)
        return dp[n];
        else 
        return dp[n]=solve(n-1,dp)+solve(n-2,dp);
    }
    public int fib(int n){
      int[] dp=new int[n+1];
      Arrays.fill(dp,-1);
      return solve(n,dp);
    }
}
//time complexity=O(n) space=O(n)