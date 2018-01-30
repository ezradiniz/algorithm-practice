package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.TreeSet;

public class SimilarPair {

    static class BinaryIndexTree {
        int n;
        long[] c;

        public BinaryIndexTree(int n) {
            this.n = n;
            this.c = new long[n * 4];
        }

        public long query(int index, int left, int right, int begin, int end) {
            if (right < begin || left > end) return 0;
            if (left <= begin && right >= end) return c[index];
            int mid = begin + (end - begin) / 2;
            return query(index * 2, left, right, begin, mid) + query(index * 2 + 1, left, right, mid + 1, end);
        }

        public void update(int index, int node, int val, int begin, int end) {
            if (node < begin || node > end) return;
            if (begin <= node && node <= end) c[index] += val;
            if (begin == node && end == node) return;
            int mid = begin + (end - begin) / 2;
            update(index * 2, node, val, begin, mid);
            update(index * 2 + 1, node, val, mid + 1, end);
        }

        public void add(int x, int num) {
            int index = x + 1;
             while (index <= n) {
                 c[index] += num;
                 index += index & (-index);
                 //index |= index + 1;
             }
        }

        public long sum(int x) {
            long res = 0;
            int index = x;
            while (index > 0) {
                res += c[index];
                index -= index & (-index);
                //index = (index & (index + 1)) - 1;
            }
            return res;
        }
    }

    static class Node {
        boolean isRoot = true;
        List<Integer> edges = new ArrayList<>();

    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        Node[] graph = new Node[n];
        for (int i = 0; i < n; ++i) {
            graph[i] = new Node();
        }

        for (int i = 0; i < n - 1; ++i) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            graph[u].edges.add(v);
            graph[v].isRoot = false;
        }

        int start = -1;
        for (int i = 0; i < n; ++i) {
            if (graph[i].isRoot) {
                start = i;
                break;
            }
        }

        if (start == -1) throw new RuntimeException();

        BinaryIndexTree tree = new BinaryIndexTree(n);

        long res = dfs(graph, start, k, tree);

        out.print(res);
    }

    private long dfs(Node[] graph, int at, int k, BinaryIndexTree tree) {
        int n = graph.length - 1;
        int l = Math.max(1, at - k);
        int r = Math.min(n, at + k);
        long res = tree.query(1, l, r, 1, n);
        tree.update(1, at, 1, 1, n);
        //tree.add(at, 1);
        for (Integer next : graph[at].edges) {
            res += dfs(graph, next, k, tree);
        }
        tree.update(1, at, -1, 1, n);
        //tree.add(at, -1);

        return res;
    }
}
