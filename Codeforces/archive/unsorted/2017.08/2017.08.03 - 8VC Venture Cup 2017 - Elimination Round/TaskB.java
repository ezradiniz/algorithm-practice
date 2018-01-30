package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        Set<String> first = new HashSet<>(n);
        for (int i = 0; i < n; ++i) first.add(in.next());
        int res = 0;
        for (int i = 0; i < m; ++i) {
            String s = in.next();
            if (first.contains(s)) ++res;
        }
        n -= res/2;
        m -= (res + 1)/2;
        if (n > m) {
            out.print("YES");
        } else {
            out.print("NO");
        }

    }
}
