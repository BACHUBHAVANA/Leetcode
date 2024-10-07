class Solution {
    public int solve(String s1,String s2,int n1,int n2,int[][] dp)
    {
        if(n1<0 || n2<0)return 0;
        if(dp[n1][n2]!=-1)return dp[n1][n2];
      if(s1.charAt(n1)==s2.charAt(n2)) 
      return dp[n1][n2]=1+solve(s1,s2,n1-1,n2-1,dp);
      else
      return  dp[n1][n2]=Math.max(solve(s1,s2,n1-1,n2,dp),solve(s1,s2,n1,n2-1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
       int[][] dp = new int[text1.length()][text2.length()];
       for(int i=0;i<dp.length;i++)
       {
        for(int j=0;j<dp[0].length;j++)
        {
           dp[i][j]=-1;
        }
       }
       return solve(text1,text2,text1.length()-1,text2.length()-1,dp);
    }
}