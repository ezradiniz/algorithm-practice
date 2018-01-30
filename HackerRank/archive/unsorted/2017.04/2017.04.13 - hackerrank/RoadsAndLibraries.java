package solutions;

import java.util.*;
import java.io.PrintWriter;

public class RoadsAndLibraries {

    static class Node {
        public boolean visited = false;
        public boolean hasPathLibrary = false;
        public boolean hasLibrary = false;
        public ArrayList<Integer> edge = new ArrayList<>();
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int q = in.nextInt();
        for (int x=0; x<q; ++x) {
            int n = in.nextInt();
            int m = in.nextInt();
            long cl = in.nextLong();
            long cr = in.nextLong();

            Node[] graph = new Node[n];
            for (int i=0; i<n; i++) graph[i] = new Node();

            for (int i=0; i<m; ++i) {
                int u = in.nextInt()-1;
                int v = in.nextInt()-1;

                graph[u].edge.add(v);
                graph[v].edge.add(u);
            }


            long cost = 0;
            cost = calcCost(graph, cl, cr);

//            if (cl <= cr) {
//                cost = cl * graph.length;
//            } else {
//                for (int i=0; i<graph.length; i++) {
//                    if (!graph[i].visited) {
//                        cost += calcCost(graph, cl, cr, i);
//                    }
//                }
//            }

            out.println(cost);
        }
    }

//    private long calcCost(RoadsAndLibraries.Node[] graph, long cl, long cr, int s) {
//
//        Queue<Integer> queue = new LinkedList<>();
//        graph[s].visited = true;
//        queue.add(s);
//
//        long cost = 0;
//
//        while (!queue.isEmpty()) {
//            int n = queue.poll();
//
//            if (!graph[n].hasLibrary && !graph[n].hasPathLibrary) {
//                graph[n].hasLibrary = true;
//                cost += cl;
//            }
//
//            for (Integer i : graph[n].edge) {
//                if ((graph[n].hasLibrary || graph[n].hasPathLibrary) && !graph[i].visited && !graph[i].hasPathLibrary && !graph[i].hasLibrary) {
//                    graph[i].hasPathLibrary = true;
//                    cost += cr;
//                }
//
//                if (!graph[i].visited) {
//                    graph[i].visited = true;
//                    queue.add(i);
//                }
//            }
//        }
//
//        return cost;
//    }

    private long calcCost(Node[] graph, long cl, long cr) {

        if (cl <= cr) return cl * graph.length;


        long cost = 0;

        for (int i=0; i<graph.length; i++) {
            if (!graph[i].visited) cost += dfs(graph, cl, cr, i);
        }

        return cost;
    }

    private long dfs(Node[] graph, long cl, long cr, int n) {

        long cost = 0;

        graph[n].visited = true;
        if (graph[n].hasPathLibrary) cost += cr;

        if (!graph[n].hasLibrary && !graph[n].hasPathLibrary) {
            graph[n].hasLibrary = true;
            cost += cl;
        }

        for (Integer i : graph[n].edge) {
            if ((graph[n].hasLibrary || graph[n].hasPathLibrary) &&  !graph[i].visited && !graph[i].hasPathLibrary && !graph[i].hasLibrary) {
                graph[i].hasPathLibrary = true;
            }
            if (!graph[i].visited) {
                cost += dfs(graph, cl, cr, i);
            }
        }

        return cost;
    }
}
