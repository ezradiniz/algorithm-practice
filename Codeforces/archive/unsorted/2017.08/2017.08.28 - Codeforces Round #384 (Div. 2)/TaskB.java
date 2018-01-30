package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long n = in.nextLong();
        long k = in.nextLong();

        int res = 0;
        long x = k & -k;

        while (x > 0) {
            ++res;
            x >>= 1;
        }

        out.print(res);
    }
}
