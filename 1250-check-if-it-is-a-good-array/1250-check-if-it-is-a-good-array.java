
class Solution {
    public boolean isGoodArray(int[] nums) {
        int GCD=nums[0];
        for (int i=1;i<nums.length;i++) {
            GCD = gcd(GCD, nums[i]);
            if (GCD == 1) {
                return true;
            }
        }
        return GCD==1;
    }
    private int gcd(int a, int b) {
        while(b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}

