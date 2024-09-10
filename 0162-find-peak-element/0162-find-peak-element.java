class Solution {
    public int findPeakElement(int[] a) {
        int low = 1;
        int high= a.length-2;
        if(a.length==1)return 0;
        if(a[0]>a[1])return 0;
        if(a[a.length-1]>a[a.length-2])return a.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]>a[mid-1] && a[mid]>a[mid+1])return mid;
            else if(a[mid]<a[mid-1])high=mid-1;
            else if(a[mid]<a[mid+1])low = mid+1;
        }
         return 0;
    }
}