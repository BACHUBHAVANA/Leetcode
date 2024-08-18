class Solution {
        static void bfs(int[][] isConnected,boolean[] visited,int v)
        {  
            Queue<Integer> q=new LinkedList<>();
            q.add(v);
            visited[v]=true;
            while(!q.isEmpty())
            {
                int temp = q.remove();
                temp-=1;
                for(int i =0;i<isConnected[temp].length;i++)
                 {
                    if(!visited[i+1] && isConnected[temp][i]==1)
                    {
                        q.add(i+1);
                        visited[i+1]=true;
                    }
                 }
            
            }
        }
        public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length+1];
        int count  =0;
        for(int i=1;i<=isConnected.length;i++)
        {
            if(!visited[i])
            {
            bfs(isConnected,visited,i);
            count++;
            }
        }
        return count;
    }
}