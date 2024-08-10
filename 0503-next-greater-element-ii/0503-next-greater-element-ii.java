class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n1 = nums.length;
        int[] res = new int[n1];
       int[] da = new int[n1*2];
        int n2 = da.length;
       for(int i=0;i<n1;i++)
        {   
           da[i+n1]= da[i]=nums[i];
           // da[i+n]=nums[i];
       }
        for(int i =0;i<n1;i++)
        {  
            res[i]=-1;
            for(int j=i+1;j<n2;j++)
            {
                if(da[j]>nums[i])
                {
                    res[i]=da[j];
                    break;
                }
            }
        }
        return res;
    }
}