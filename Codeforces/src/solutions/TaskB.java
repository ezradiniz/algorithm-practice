package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskB {

    static class Vertex {
        List<Integer> edges = new ArrayList<>();
    }

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();

        Vertex[] graph = new Vertex[n];
        for (int i = 0; i < n; ++i) graph[i] = new Vertex();

        for (int i = 0; i < n - 1; ++i) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;

            graph[u].edges.add(v);
            graph[v].edges.add(u);
        }

        boolean[] mark = new boolean[n];
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        BigInteger res = dfs(graph, 0, mark, a, b, 0);

        BigInteger r1 = BigInteger.valueOf(a.size());
        BigInteger r2 = BigInteger.valueOf(b.size());

        out.print(r1.multiply(r2).subtract(res).toString());
    }

    private BigInteger dfs(Vertex[] graph, int at, boolean[] mark, Set<Integer> a, Set<Integer> b, int x) {
        mark[at] = true;
        if (x % 2 == 0) a.add(at);
        else b.add(at);

        BigInteger res = BigInteger.ZERO;

        for (int next : graph[at].edges) {
            if (mark[next]) continue;
            res = res.add(dfs(graph, next, mark, a, b, x + 1)).add(BigInteger.ONE);
        }

        return res;
    }
}
