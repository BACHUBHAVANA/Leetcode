class Solution {
    public boolean containsDuplicate(int[] a) {
        long n = a.length;
        Arrays.sort(a);
        for(int i = 0;i<n-1;i++){
              if(a[i]==a[i+1])
              return true;
            }
        return false;    
    }
}