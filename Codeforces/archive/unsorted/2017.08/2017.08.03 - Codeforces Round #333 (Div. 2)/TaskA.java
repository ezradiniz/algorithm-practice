package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int bx = in.nextInt();

        long res1 = 0;
        for (int i = 0; i < n; ++i) {
            long x = in.nextInt();
            res1 += x * Math.pow(bx, n - i - 1);
        }

        int m = in.nextInt();
        int by = in.nextInt();

        long res2 = 0;
        for (int i = 0; i < m; ++i) {
            long y = in.nextInt();
            res2 += y * Math.pow(by, m - i - 1);
        }

        if (res1 == res2) out.print("=");
        else if (res1 > res2) out.print(">");
        else out.print("<");
    }
}
