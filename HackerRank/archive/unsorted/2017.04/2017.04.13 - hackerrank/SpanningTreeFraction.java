package solutions;

import java.util.*;
import java.io.PrintWriter;

public class SpanningTreeFraction {
    static class Node {
        public int vertice;
        public ArrayList<Integer[]> edge = new ArrayList<>();
        public Node(int v) {this.vertice = v;}
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int n = in.nextInt();
        int m = in.nextInt();

        Node[] graph = new Node[n];

        for (int i=0; i<n; i++) graph[i] = new Node(i);

        for (int i=0; i<m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            if (u == v) continue;

            graph[u].edge.add(new Integer[]{v, a, b});
            graph[v].edge.add(new Integer[]{u, a, b});
        }

        String res = bfs(graph);
        out.print(res);
    }

    private String bfs(Node[] graph) {

        boolean[] visited = new boolean[graph.length];
        ArrayList<Integer[]> weight = new ArrayList<>();
        Queue<Integer> Q = new LinkedList<>();
        HashSet<String> bridge = new HashSet<>();
        Q.add(0);

        while (!Q.isEmpty()) {
            int p = Q.poll();

            for (Integer[] v : graph[p].edge) {
                int u = v[0];
                int a = v[1];
                int b = v[2];

                if (!bridge.contains(""+u+p) && !bridge.contains(""+p+u)) {
                    weight.add(new Integer[] {a, b});
                    bridge.add(""+u+p);
                }

                if (!visited[u]) {
                    visited[u] = true;
                    Q.add(u);
                }
            }
        }


        float max = Float.MIN_NORMAL;
        String res = "1";
        for (int i=0; i<weight.size(); i++) {
            Integer[] p = weight.get(i);
            int a1 = p[0];
            int b1 = p[1];

            for (int j=i+1; j<weight.size(); j++) {
                Integer[] q = weight.get(j);
                int a2 = q[0];
                int b2 = q[1];

                float r = ((float)(a1+a2))/(b1+b2);

                if (r > max) {
                    max = r;
                    res = (a1+a2) +"/"+(b1+b2);
                }
            }
        }

        return res;
    }
}
