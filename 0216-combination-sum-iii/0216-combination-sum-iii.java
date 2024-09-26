class Solution {
    public void backtrack(int start,int n,int t, List<List<Integer>> res,List<Integer> curr)
    {
         if(curr.size()==n)
         {
           if(t==0)
           {
            res.add(new ArrayList(curr));
            return;
           }
           else
           {
            return;
           }
         }
         for(int i=start;i<=9;i++)
         {
            curr.add(i);
            backtrack(i+1,n,t-i,res,curr);
            curr.remove(curr.size()-1);
         }
    }
    public List<List<Integer>> combinationSum3(int n, int t) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        backtrack(1,n,t,res,curr);
        return res;

    }
}