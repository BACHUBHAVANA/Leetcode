class Solution {
    public int trap(int[] h) {
        int n =h.length;
        int[] prefixmax=new int[n];
        int[] suffixmax= new int[n];
        int store =0;
         prefixmax[0]=h[0];
        for(int i =1;i<n;i++)
        {
           prefixmax[i]=Math.max(prefixmax[i-1],h[i]);
        }
        suffixmax[n-1]=h[n-1];
        for(int i =n-2;i>=0;i--)
        {
           suffixmax[i]=Math.max(suffixmax[i+1],h[i]);
        }
         for(int i =0;i<n;i++)
        {
            int max1=prefixmax[i];
            int max2=suffixmax[i];
            store+=Math.min(max1,max2)-h[i];
        }
        return store;
    }
}