class Solution {
    static public int numSquare(int n)
    {
       int  num=0;
       while(n!=0)
       {
       int  digit = n%10;
        num+=digit*digit;
        n/=10;
       }
       return num;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> st = new HashSet<>();
        while(true)
        {
           n =numSquare(n);
           if(n==1)
           return true;
           if(st.contains(n))
           return false;
           st.add(n);
        }
    }
}