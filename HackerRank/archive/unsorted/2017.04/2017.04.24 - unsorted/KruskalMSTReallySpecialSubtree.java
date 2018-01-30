package solutions;

import java.util.*;
import java.io.PrintWriter;

public class KruskalMSTReallySpecialSubtree {

    public class Edge {
        int src, dest, weight;
    }

    public class subset {
        int parent, rank;
    }

    public class Graph {

        public int V, E;
        public Edge[] edge;

        public Graph(int v, int e) {
            this.V = v;
            this.E = e;
            this.edge = new Edge[E];
            for (int i = 0; i < e; ++i)
                edge[i] = new Edge();
        }

        public int find(subset subsets[], int i) {
            if (subsets[i].parent != i)
                subsets[i].parent = find(subsets, subsets[i].parent);

            return subsets[i].parent;
        }

        public void Union(subset subsets[], int x, int y) {
            int xroot = find(subsets, x);
            int yroot = find(subsets, y);

            if (subsets[xroot].rank < subsets[yroot].rank)
                subsets[xroot].parent = yroot;
            else if (subsets[xroot].rank > subsets[yroot].rank)
                subsets[yroot].parent = xroot;

            else {
                subsets[yroot].parent = xroot;
                subsets[xroot].rank++;
            }
        }


        public int KruskalMST() {
            Edge result[] = new Edge[V];
            int e = 0;
            int i = 0;
            for (i = 0; i < V; ++i)
                result[i] = new Edge();

            Arrays.sort(edge, new Comparator<Edge>() {
                @Override
                public int compare(Edge edge, Edge t1) {
                    return edge.weight - t1.weight;
                }
            });

            subset subsets[] = new subset[V];
            for (i = 0; i < V; ++i)
                subsets[i] = new subset();

            for (int v = 0; v < V; ++v) {
                subsets[v].parent = v;
                subsets[v].rank = 0;
            }

            i = 0;

            while (e < V - 1) {

                Edge next_edge = edge[i++];

                int x = find(subsets, next_edge.src);
                int y = find(subsets, next_edge.dest);

                if (x != y) {
                    result[e++] = next_edge;
                    Union(subsets, x, y);
                }
            }

            int sum = 0;
            for (i = 0; i < e; ++i)
                sum += result[i].weight;
            return sum;
        }
    }


    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        Graph graph = new Graph(n , m);

        for (int i = 0; i < m; ++i) {
            int x = in.nextInt()-1;
            int y = in.nextInt()-1;
            int r = in.nextInt();

            graph.edge[i].src = x;
            graph.edge[i].dest = y;
            graph.edge[i].weight = r;
        }

        int res = graph.KruskalMST();
        out.println(res);
    }

}
