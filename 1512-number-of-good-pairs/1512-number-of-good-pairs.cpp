class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        map<int,int> m;
        int pc=0;
    for(int i=0;i<nums.size();i++)
    {
        pc=pc+m[nums[i]]  ;
        m[nums[i]]=m[nums[i]]+1; 
    }
    return pc;
    }
};