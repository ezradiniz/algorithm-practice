package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskC {

    static class Vertex {
        boolean mark = false;
        Set<Integer> edge = new HashSet<>();
    }

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();

        Vertex[] graph = new Vertex[n];
        for (int i = 0; i < n; ++i) graph[i] = new Vertex();

        for (int u = 0; u < n; ++u) {
            int v = in.nextInt() - 1;
            graph[u].edge.add(v);
            graph[v].edge.add(u);
        }

        int res = 0;
        for (int i = 0; i < n; ++i) {
            if (graph[i].mark) continue;
            dfs(graph, i);
            ++res;
        }
        out.print(res);
    }

    private void dfs(Vertex[] graph, int at) {
        graph[at].mark = true;
        for (Integer next : graph[at].edge) {
            if (graph[next].mark) continue;
            dfs(graph, next);
        }
    }
}
