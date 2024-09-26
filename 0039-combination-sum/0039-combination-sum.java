class Solution {
       public void backtrack(int start,List<Integer> curr,int[] candidates,int target,List<List<Integer>> res)
       {
        if(target==0)
        {
           res.add(new ArrayList<>(curr));
           return;
        }
        else if(target<0)
        {
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            curr.add(candidates[i]);
             backtrack(i,curr,candidates,target-candidates[i],res);
             curr.remove(curr.size()-1);
        }
       }
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        backtrack(0,curr,candidates,target,res);
        return res;
    }
}
