import java.util.*;

class dijkstra
{
    int dist[] , prev[], pathlenght[];
    boolean visited[];

    public void shortestPath(int[][] G, int source)
    {
      int u = source;
      int alt;
      int n = G.length;
      this.dist = new int[n];
      this.prev = new int[n];
      this.pathlenght = new int[n];
      this.visited = new boolean[n];

      for(int i = 0; i < n; i++ )
      {
          this.dist[i] = 999;
          this.prev[i] = -1;
          this.pathlenght[i] = 0;
          this.visited[i] = false;
      }
      this.dist[u] = 0;
      this.prev[u] = -1;
      while(!this.visited[u])
      {
          this.visited[u] = true;

          for(int v = 0 ;v < n; v++)
          {
              if(G[u][v] < 999 && !this.visited[v])
              {
                  alt = dist[u] + G[u][v];
                  if(alt < this.dist[v])
                  {
                      this.dist[v] = alt;
                      this.prev[v] = u;
                      this.pathlenght[v] = this.pathlenght[u] + 1;

                  }
              }
          }
          u = this.minDist();
      }
    }
    private int minDist()
    {
        int min = 999;
        int l = 0;
        for(int i = 0;i < this.dist.length; i++)
        {
            if(!this.visited[i])
            {
                if(min > this.dist[i])
                {
                    min = this.dist[i];
                    l = i;
                }
            }
        }
        return l;
    }

    public static void main(String[] args) 
    {
        dijkstra d = new dijkstra();
        int[][] G = new int[][]{{0,1,999,999,10},{1,0,4,999,999},{999,4,0,7,999},{999,999,7,0,2},{10,999,999,2,0}};
        System.out.println(G.length);
        int source = 0;
        d.shortestPath(G, source);
        for(int i = 0; i < G.length ; i++)
        {
            System.out.println("The shortest distane from 0 to "+i+" is :");
            if(d.prev[i] == -1)
            {
                System.out.println(" cost :"+d.dist[i]);
            }
            else
            {
                System.out.print(" cost :"+d.dist[i]+" Path "+i+" -> ");
                int j =i;
                while(d.prev[j] != source)
                {
                   
                    System.out.print(d.prev[j]+" ->");
                    j = d.prev[j];
                    
                }
                System.out.print(source);
                System.out.println("");

            }
        }
        
    }
}