package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskC {

    static class Vertex {
        boolean home = false;
        Set<Integer> edges = new HashSet<>();
    }

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        Vertex[] graph = new Vertex[n];
        for (int i = 0; i < n; ++i) {
            graph[i] = new Vertex();
        }

        for (int i = 0; i < k; ++i) {
            graph[in.nextInt() - 1].home = true;
        }

        for (int i = 0; i < m; ++i) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            graph[u].edges.add(v);
            graph[v].edges.add(u);
        }

        int start = -1;
        int max = -1;
        for (int i = 0; i < n; ++i) {
            if (graph[i].home && graph[i].edges.size() > max) {
                max = graph[i].edges.size();
                start = i;
            }
        }

        if (start == -1) throw new RuntimeException();

        boolean[] mark = new boolean[n];
        int res = dfs(graph, start, mark);

        out.print(res);
    }

    private int dfs(Vertex[] graph, int at, boolean[] mark) {
        int res = 0;
        mark[at] = true;

        for (int i = 0; i < graph.length; ++i) {
            if (graph[i].home) continue;
            if (i != at && !graph[i].edges.contains(at)) {
                graph[at].edges.add(i);
                ++res;
            }
            if (mark[i]) continue;


            res += dfs(graph, i, mark);
        }

        return res;
    }
}
