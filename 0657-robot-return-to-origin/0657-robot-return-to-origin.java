class Solution {
    public boolean judgeCircle(String moves) {
        int updown=0;
        int leftRight=0;
        for(char c :moves.toCharArray())
        {
            if(c=='U')
            updown++;
            else if(c=='D')
            updown--;
            else if(c=='L')
            leftRight++;
            else if(c=='r')
            leftRight--;    
        }
       return updown == 0 && leftRight == 0;
    }
}