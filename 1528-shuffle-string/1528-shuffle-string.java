class Solution {
    public String restoreString(String s, int[] indices) {
        char[] s1 = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            s1[indices[i]]=s.charAt(i);
        }
        return new String(s1);
    }
}