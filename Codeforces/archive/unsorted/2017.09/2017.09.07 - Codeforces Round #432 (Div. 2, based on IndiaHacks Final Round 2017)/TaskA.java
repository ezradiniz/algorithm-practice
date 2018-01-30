package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long n = in.nextLong();
        long k = in.nextLong();
        long t = in.nextLong();

        if (t <= k) {
            out.print(t);
            return;
        }

        if (t <= n) {
            out.print(k);
            return;
        }

        out.print(n + k - t);
    }
}
