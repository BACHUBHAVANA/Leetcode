class Solution {
    public int findComplement(int num) {
        int highestSetBit=30;
        for(;highestSetBit>=0;highestSetBit--)
        {
            if(checkSetBit(highestSetBit,num)){
                break;
            }
        }
        highestSetBit++;
        int mask=(1<<highestSetBit)-1;
        return num^mask;
    }
    boolean checkSetBit(int idx,int num)
    {
    return ((1<<idx)&num)!=0;
    }
}