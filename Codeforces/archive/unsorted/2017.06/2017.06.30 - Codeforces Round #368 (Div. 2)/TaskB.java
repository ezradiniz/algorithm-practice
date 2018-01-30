package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {

    static class Vertice {
        ArrayList<Edge> edges = new ArrayList<>();
        boolean hasStorage = false;
        boolean visited = false;
    }

    static class Edge {
        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        Vertice[] graph = new Vertice[n];

        for (int i = 0; i < n; ++i) graph[i] = new Vertice();

        for (int i = 0; i < m; ++i) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            int l = in.nextInt();

            graph[u].edges.add(new Edge(v, l));
            graph[v].edges.add(new Edge(u, l));
        }

        for (int i = 0; i < k; ++i) {
            int a = in.nextInt() - 1;
            graph[a].hasStorage = true;
        }

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            if (!graph[i].visited && !graph[i].hasStorage) {
                res = Math.min(res, rec(graph, i));
            }
        }

        if (res == Integer.MAX_VALUE) out.print(-1);
        else out.print(res);
    }

    private int rec(Vertice[] graph, int next) {

        if (graph[next].hasStorage) return Integer.MAX_VALUE;
        graph[next].visited = true;

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < graph[next].edges.size(); ++i) {
            Edge e = graph[next].edges.get(i);
            if (!graph[e.to].visited && !graph[e.to].hasStorage) {
                res = Math.min(res, rec(graph, e.to));
            }
            if (graph[e.to].hasStorage) {
                res = Math.min(res, e.weight);
            }
        }

        return res;
    }
}
