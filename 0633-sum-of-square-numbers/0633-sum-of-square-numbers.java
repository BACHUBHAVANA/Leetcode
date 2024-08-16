class Solution {
    public boolean judgeSquareSum(int c) {
        int i,j,k;
        int sq =(int)Math.sqrt(c);
        for(i =0;i<=sq;i++)
        {
            j=c-i*i;
            k =(int)Math.sqrt(j);
            if(k*k==j)
            return true;
        }
        return false;
    }
}