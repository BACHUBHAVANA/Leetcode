class Solution {
    public String nearestPalindromic(String n) {
        ArrayList<Long> list=new ArrayList<>();
        int len =n.length();
        //check the len of n is odd or not
        boolean isOdd= len%2!=0;
        //copy first half
        int mid=(len%2==0)?(len/2):(len/2+1);
        Long firstHalf=Long.parseLong(n.substring(0,mid));//finding first half
        //case 1
        //copy first half in reverse order
        list.add(findNearestPalindrome(firstHalf,isOdd));
        //case 2
        //finding next palindrome
        list.add(findNearestPalindrome(firstHalf+1,isOdd));
        //case 3
        //finding previous palindrome
        list.add(findNearestPalindrome(firstHalf-1,isOdd));
        //case 4
        //special case handling all 9's..
        list.add((long)Math.pow(10,len-1)-1);
        //case 5
        //special case handling all 101,1001,10001...
        list.add((long)Math.pow(10,len)+1);
        long num=Long.parseLong(n);
        long minDiff=Long.MAX_VALUE;
        long res=Long.MAX_VALUE;
        //finding nearest palindrome 
        for(Long element : list){
            if(element==num)continue;
            long currDiff=Math.abs(element-num);
            if(currDiff<minDiff){
                res=element;
                minDiff=currDiff;
            }else if(currDiff==minDiff){
                res= Math.min(res,element);
            }
        }
       return String.valueOf(res);
    }
    public long findNearestPalindrome(long firstHalf,boolean isOdd){
        long res=firstHalf;
        //if odd make even by removing last digit
        if(isOdd){
            firstHalf=firstHalf/10;
        }
        //adding second half to first half
        while(firstHalf>0){
            res=res*10+(firstHalf%10);
            firstHalf=firstHalf/10;
        }
        //possible answer
        return res;
    }
}