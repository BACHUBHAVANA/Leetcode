class Solution {
    static class pair
    {
        int r;
        int c;
        pair(int i,int j)
        {
            r=i;
            c=j;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<pair> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int count =0;
        for(int i = 0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new pair(i,j));
                }
            }
        }
        q.add(null);
        while(!q.isEmpty())
        {
            pair p = q.remove();
            if(p==null)
            {
                if(q.isEmpty())break;
                count++;
                q.add(null);
            }
            else
            {
                int r=p.r;
                int c=p.c;
                for(int i =-1;i<=1;i++)
                {
                    for(int j=-1;j<=1;j++)
                    {
                        if(r==r+i || c==c+j)
                        {
                            int row = r+i;
                            int col = c+j;
                            if(row>=0 && row<m && col >=0 && col<n && grid[row][col]==1)
                            {
                                q.add(new pair(row,col));
                                grid[row][col]=2;
                            }
                        }
                    }
                }
            }
        }
        for(int i =0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(grid[i][j]==1)
               return -1;
            }
        }
        return count;
}
}