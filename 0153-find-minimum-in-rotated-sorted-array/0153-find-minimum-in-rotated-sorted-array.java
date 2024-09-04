class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
       // System.out.print(nums[0]);
       return nums[0];
    }
}