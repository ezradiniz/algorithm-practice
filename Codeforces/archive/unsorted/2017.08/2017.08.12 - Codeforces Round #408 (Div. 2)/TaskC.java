package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.*;

public class TaskC {

    static class Bank {
        List<Integer> wires = new ArrayList<>();
        int strength;
        int deep = 0;

        public Bank(int strength) {
            this.strength = strength;
        }
    }

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        Bank[] graph = new Bank[n];
        int[][] g = new int[n][2];
        for (int i = 0; i < n; ++i) {
            graph[i] = new Bank(in.nextInt());
            g[i][0] = graph[i].strength;
            g[i][1] = i;
        }
        for (int i = 0; i < n  - 1; ++i) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            graph[u].wires.add(v);
            graph[v].wires.add(u);
        }

        Arrays.sort(g, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return t1[0] - ints[0];
            }
        });

        boolean[] mark = new boolean[n];
        for (int i = 0; i < n; ++i) {
            if (mark[g[i][1]]) continue;
            dfs(graph, g[i][1], mark);
        }

        int res = g[0][0];
        for (int i = 0; i < n; ++i) res = Math.max(res, graph[i].strength);
        out.print(res);
    }

    private void dfs(TaskC.Bank[] graph, int at, boolean[] mark) {
        mark[at] = true;
        graph[at].strength += graph[at].deep;
        for (Integer next : graph[at].wires) {
            if (!mark[next]) {
                graph[next].deep++;
                //graph[next].strength++;
                dfs(graph, next, mark);
            } else {
                if (graph[next].deep > 0) graph[at].strength += graph[next].deep;
            }
        }
    }
}
