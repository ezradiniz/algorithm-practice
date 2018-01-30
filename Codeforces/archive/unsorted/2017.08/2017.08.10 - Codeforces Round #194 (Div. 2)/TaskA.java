package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();

        int v = n * n;

        for (int i = 0, x = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if ((j & 1) == 0) out.print((1 + x) + " ");
                else out.print((v - x) + " ");
                if (j % 2 == 1) ++x;
            }
            out.println();
        }
    }
}
