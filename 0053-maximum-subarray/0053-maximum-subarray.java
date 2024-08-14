class Solution {
    public static  int maxSubArray(int[] nums) {
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int start = 0;
    int end = 0;
    for(int i=0;i<nums.length;i++)
    {
        currentSum+=nums[i];
         if (currentSum>=maxSum){
            maxSum = currentSum;
            end =i;
        }
        if(currentSum<0){
            currentSum=0;
            start=i+1;
        }
    }
    System.out.println(start);
    System.out.println(end);
    return maxSum;
}   
public static void  main(String[] args) {
 //int [] nums ={-2,1,-3,4,-1,2,1,-5,4};
 int [] nums = {5,4,-1,7,8};
 int maxSum =  maxSubArray(nums);
 System.out.println(maxSum);
}
}