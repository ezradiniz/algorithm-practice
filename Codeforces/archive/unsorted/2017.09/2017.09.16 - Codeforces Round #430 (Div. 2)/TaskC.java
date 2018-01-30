package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TaskC {

    boolean[] isPrime;

    static class Vertex {
        int a;
        boolean mark = false;
        int res = 1;
        List<Integer> edges = new ArrayList<>();

        public Vertex(int a) {
            this.a = a;
        }
    }

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        Vertex[] tree = new Vertex[n];

        int max = 0;
        for (int i = 0; i < n; ++i) {
            tree[i] = new Vertex(in.nextInt());
            max = Math.max(max, tree[i].a);
        }

        isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);

        calcPrime();

        for (int i = 0; i < n - 1; ++i) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            tree[u].edges.add(v);
            tree[v].edges.add(u);
        }

        TreeSet<Integer> ts = new TreeSet<>();

        rec(tree, 0, ts);

        for (int i = 0; i < n; ++i) out.print(tree[i].a + " ");
    }

    private void rec(Vertex[] tree, int at, TreeSet<Integer> ts) {
        Vertex cur = tree[at];
        ts.add(cur.a);
        cur.mark = true;
        int res = 0;

        cur.res = res;

        for (int next : cur.edges) {
            if (tree[next].mark) continue;
            rec(tree, next, ts);
        }

        ts.remove(cur.a);
    }

    private void calcPrime() {
        int n = isPrime.length;
        for (int i = 2; i * i <= n; ++i) {
            if (isPrime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
