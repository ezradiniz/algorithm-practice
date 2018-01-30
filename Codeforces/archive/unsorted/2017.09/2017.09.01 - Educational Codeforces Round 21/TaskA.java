package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long n = in.nextLong();
        if (n < 9) {
            out.print(1);
            return;
        }
        int d = 0;
        long k = n;
        while (k > 0) {
            ++d;
            k /= 10;
        }
        int t = (int) Math.pow(10, d - 1);
        int f = (int) (n / t) + 1;

        out.print(f * t - n);
    }
}
