package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TaskD {

    static class Vertex {
        int n;
        List<Edge> edges = new ArrayList<>();

        public Vertex(int n) {
            this.n = n;
        }
    }

    static class Edge {
        int index;
        int to;

        public Edge(int to, int index) {
            this.to = to;
            this.index = index;
        }
    }

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        if (m == 0) {
            out.print("-1");
            return;
        }

        Vertex[] graph = new Vertex[n];
        for (int i = 0; i < n; ++i) {
            graph[i] = new Vertex(in.nextInt());
        }

        for (int i = 0; i < m; ++i) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            graph[u].edges.add(new Edge(v, i + 1));
            graph[v].edges.add(new Edge(u, i + 1));
        }

        boolean[] mark = new boolean[n];

        for (int i = 0; i < n; ++i) {
            if (!mark[i]) {
                dfs(graph, i, mark);
            }
        }
    }

    private void dfs(Vertex[] graph, int at, boolean[] mark) {
        mark[at] = true;

    }
}
