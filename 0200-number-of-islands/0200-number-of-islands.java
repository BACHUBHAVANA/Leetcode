class Solution {
    static class pair
 {
    int r;
    int c;
    pair(int i,int j)
    {
        r =i;
        c=j;
    }
 }
    public void bfs(char[][] grid,boolean[][] visited,int r,int c)
    {
        int m = grid.length;
        int n = grid[0].length;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(r,c));
        visited[r][c]=true;
        while(!q.isEmpty())
        {
            pair p= q.remove();
            int row = p.r;
            int col = p.c;
            for(int i =-1;i<=1;i++)
            {
                for(int j = -1;j<=1;j++)
                {
                    if(row==row+i||col==col+j)
                    {
                        int rrow=row+i;
                        int ccol = col+j;
                        if(rrow>=0 && rrow<m && ccol>=0 && ccol<n && grid[rrow][ccol]== '1' && !visited[rrow][ccol])
                        {
                            visited[rrow][ccol]=true;
                            q.add(new pair(rrow,ccol));
                        }
                    }
                }
            }
        } 
    }  
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
         boolean[][] visited = new boolean[m][n];
        int count =0;
        for(int i =0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(!visited[i][j] && grid[i][j]=='1')
                {
                count++;
                 bfs(grid,visited,i,j);   
                }
            }
        }
        return count;
    }
}