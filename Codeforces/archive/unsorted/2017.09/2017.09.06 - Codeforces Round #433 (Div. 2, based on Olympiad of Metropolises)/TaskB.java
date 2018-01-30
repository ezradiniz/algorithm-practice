package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long n = in.nextInt();
        long k = in.nextInt();

        if (n == k || k == 0) {
            out.print("0 0");
            return;
        }

        long max = k * 2;
        if (k >= n / 3 + 1) max = n - k;
        out.print("1 " + max);
    }
}
