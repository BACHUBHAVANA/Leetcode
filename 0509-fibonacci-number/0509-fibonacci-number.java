class Solution {
    public int solve(int n)
    {
        if(n==0)return 0;
        if(n==1)return 1;
       int p2=0;
        int p1=1;
        for(int i=2;i<=n;i++)
        {
           int c=p1+p2;
            p2=p1;
            p1=c;
        }
        return p1;
    }
    public int fib(int n){
      return solve(n);
    }
}
//time complexity=O(n) space=O(1)
//pointers
//we are using another function because needed arguments are 2