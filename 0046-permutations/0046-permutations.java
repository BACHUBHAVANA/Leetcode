class Solution {
    public void backtrack(int[] nums,List<List<Integer>> res,List<Integer>curr)
    {   
        if(curr.size()==nums.length)
        {
            res.add(new ArrayList(curr));
            return;
        }
        for(int i:nums)
        {
            if(!curr.contains(i))
            {
                curr.add(i);
                backtrack(nums,res,curr);
                curr.remove(curr.size()-1);

            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>(); 
        List<Integer> curr=new ArrayList<>();
        backtrack(nums,res,curr);
        return res;

    }
}