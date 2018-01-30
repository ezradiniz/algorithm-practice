package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        if ((n & 1) == 1) {
            out.print("-1");
            return;
        }

        for (int i = 1; i <= n; ++i) {
            if ((i & 1) == 1) out.print((i + 1) + " ");
            else out.print((i - 1) + " ");
        }
    }
}
