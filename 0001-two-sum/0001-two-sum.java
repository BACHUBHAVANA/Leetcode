class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer,Integer>  map = new HashMap<>();
         int[] ans = new int[2];
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(map.containsKey(target-nums[i]))
        //     {
        //         ans[0] = map.get(target-nums[i]);
        //         ans[1]=i;
        //         break;
        //     }
        //     else
        //     {
        //         map.put(nums[i],i);
        //     }
        for(int i =0;i<nums.length-1;i++)
        {
            for(int j =i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
