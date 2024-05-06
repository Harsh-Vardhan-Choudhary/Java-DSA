package Graphs;

import java.util.*;

public class BellmanFordAlgo
{
    static class Edge
    {
        int src;
        int dest;
        int wt;
        
        public Edge(int s, int d, int w)
        {
            this.src = s;
            this.dest = d; 
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i=0; i<graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));
        
        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, -1, -1));
    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src)    
    {
        int dist[] = new int[graph.length];
        for(int i=0; i<dist.length; i++)
        {
            if(i != src)
            {
                dist[i] = Integer.MIN_VALUE;
            }
        }

        int V = graph.length;

        //algo
        for(int i=0; i<V-1; i++)
        {
            
        }
        

    }

    public static void main(String[] args)
    {
        int v=5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
    }
}
