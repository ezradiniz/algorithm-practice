package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        Set<Integer> h = new HashSet<>();
        for (int i = 0; i <  m; ++i) {
            h.add(in.nextInt());
        }
        int cur = 1;
        for (int sp = 0; sp < k; ++sp) {
            int u = in.nextInt();
            int v = in.nextInt();
            if (u != cur && v != cur) continue;
            if (h.contains(cur)) {
                out.print(cur);
                return;
            }
            if (u == cur) cur = v;
            else if (v == cur) cur = u;
        }
        out.print(cur);
    }
}
