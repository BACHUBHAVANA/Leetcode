class Solution {
    public void conquer(int[] a,int si,int mid,int ei)
    {   int[] temp=new int[ei-si+1];
        int  k=0;
        int p1=si;
        int p2=mid+1;
        while(p1<=mid && p2<=ei)
        {
            if(a[p1]<=a[p2]) temp[k++]=a[p1++];
            else temp[k++]=a[p2++];
        }
        while(p1<=mid) temp[k++]=a[p1++];
        while(p2<=ei) temp[k++]=a[p2++];
        int p=si;
        for(int i =0;i<temp.length;i++)
        {
            a[p++]=temp[i];
        }
    }
    public void function(int[] nums,int si,int ei)
    {    
         if(si>=ei)return;
         int mid=si+(ei-si)/2;
         function(nums,si,mid);
         function(nums,mid+1,ei);  
         conquer(nums,si,mid,ei);    
    }
    public int[] sortArray(int[] nums) {
        function(nums,0,nums.length-1);
        return  nums;
    }
}