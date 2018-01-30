package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TaskC {

    static class Vertex {
        int dist = 0;
        boolean stop = false;
        List<Integer> edges = new ArrayList<>();
    }



    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        Vertex[] graph = new Vertex[n];
        for (int i = 0; i < n; ++i) {
            graph[i] = new Vertex();
        }
        for (int i = 0; i < n - 1; ++i) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            graph[u].edges.add(v);
            graph[v].edges.add(u);
        }


        double res = dfs(graph, 0, -1);
        out.print(String.format("%.15" +
                "f", res));
    }

    private double dfs(Vertex[] graph, int v, int p) {
        double sum = 0;
        for (Integer u : graph[v].edges) {
            if (u != p) sum += dfs(graph, u, v) + 1;
        }
        if (p == -1) p = 0;
        else p = 1;
        return (sum > 0) ? (sum / (graph[v].edges.size() - p)) : 0;
    }
}
