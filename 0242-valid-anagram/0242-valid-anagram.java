class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()) return false;
       int[] hash=new int[26];
       int n=s.length();
       for(int i =0;i<n;i++)
       {
        ++hash[s.charAt(i)-'a'];
        --hash[t.charAt(i)-'a'];
       } 
       for(int i =0;i<26;i++)
       {
        if(hash[i]!=0)return false;
       }
       return true;
    }
}