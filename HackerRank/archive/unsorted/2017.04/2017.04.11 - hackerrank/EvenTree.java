package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class EvenTree {

    static class Node {
        public boolean isVisited = false;
        public int weight = 1;
        public ArrayList<Integer> edges = new ArrayList<>();
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        Node[] tree = new Node[n];

        for (int i=0; i<n; i++) {
            tree[i] = new Node();
        }

        for (int i=0; i<m; i++) {
            int u = in.nextInt()-1;
            int v = in.nextInt()-1;
            tree[u].edges.add(v);
            tree[v].edges.add(u);
        }

        int res = evenTree(tree);
        out.print(res);
    }

    private static int evenTree(Node[] tree) {
        dfs(tree,  0);
        int count = 0;
        for (int i=0; i<tree.length; i++) {
            if (tree[i].weight % 2 == 0) {
                count++;
            }
        }

        return count-1;
    }

    private static int dfs(Node[] tree, int next) {

        tree[next].isVisited = true;

        for (Integer n: tree[next].edges) {
            if (!tree[n].isVisited) {
                tree[next].weight += dfs(tree, n);
            }
        }

        return tree[next].weight;
    }
}
