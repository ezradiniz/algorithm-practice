package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class DijkstraShortestReach2 {

    static final int INF = (int)(1e5 + 1);

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int x = 0; x < t; ++x) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[][] graph = new int[n][n];

            for (int i = 0; i < m; ++i) {
                int u = in.nextInt()-1;
                int v = in.nextInt()-1;
                int w = in.nextInt();
                if (graph[u][v] != 0) {
                    graph[u][v] = Math.min(graph[u][v], w);
                    graph[v][u] = Math.min(graph[u][v], w);
                } else {
                    graph[u][v] = w;
                    graph[v][u] = w;
                }
            }

            int s = in.nextInt()-1;

            int[] dist = dijkstra(graph, s);

            for (int i = 0; i < dist.length; ++i) {
                if (i == s) continue;
                if (dist[i] == INF) out.print("-1 ");
                else out.print(dist[i] + " ");
            }
            out.println();
        }
    }

    private int[] dijkstra(int[][] graph, int s) {
        int[] dist = new int[graph.length];
        boolean[] visited = new boolean[graph.length];

        for (int i = 0; i < dist.length; ++i) {
            dist[i] = INF;
        }

        dist[s] = 0;
        for (int k = 0; k < graph.length-1; ++k) {

            s = distance(dist, visited);
            visited[s] = true;

            for (int i = 0; i < graph.length; ++i) {
                if (!visited[i] && graph[s][i] != 0) {
                    dist[i] = Math.min(dist[i], dist[s] + graph[s][i]);
                }
            }
        }

        return dist;
    }

    private int distance(int[] dist, boolean[] visited) {
        int min = INF, v = -1;
        for (int i = 0; i < dist.length; ++i) {
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                v = i;
            }
        }
        return v;
    }
}
