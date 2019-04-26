import java.util.*;


public class iscycle
{
    int[] visited;
    int count;
    public boolean iscycleG(int[][] G,int n)
    {
        this.visited = new int[n];
        for(int i = 0; i < n ; i++)
        {
            this.visited[i] = -1;
        }
        int i = 0 ;
        this.count = 0;
        while(this.visited[i] == -1)
        {
            this.checkCycle(G,i,n);
           i = nonvisited(n);
        }
        System.out.println(this.count);
        if(this.count > 0)
        { 
            return true;
        }
         return false;

    }
    public int nonvisited(int n)
    {
        for(int i = 0;i < n;i++)
        {
            if(this.visited[i] == -1)
            {
                return i;
            }
        }
        return 0;
    }

    public void checkCycle(int[][] G, int i, int n) 
    {
      
        this.visited[i] = 1;
        for(int j = 0; j < n; j++)
        {
            if(G[i][j] == 1)
            {
                if( i == j)
                {
                    this.count = this.count + 1;
                }
                else if(G[j][i] == 1 )
                {
                    if(this.visited[j] == -1)
                    {
                        this.count = this.count + 1;
                    }
                   //if(this.visited[i] == -1)
                   //this.count = checkCycle(G, j, n);
                }
                else if (this.visited[j] == 1)
                {
                    this.count = this.count + 1;
                }
                else      
                {
                    checkCycle(G, j, n);
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        iscycle c = new iscycle();
        int[][] G = new int[][]{{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1},{1,0,0,0,0},{0,0,1,0,0}};
        
        if(c.iscycleG(G, G.length))
        {
            System.out.println("this graph is cyclic");
        }
        else
        {
            System.out.println("not cyclic");
        }
        
    }
}