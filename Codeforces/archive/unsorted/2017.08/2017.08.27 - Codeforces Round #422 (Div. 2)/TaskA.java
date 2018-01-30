package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long a = in.nextLong();
        long b = in.nextLong();
        long res = 1;
        for (long i = 1; i < Math.min(a, b) + 1; ++i) res *= i;
        out.print(res);
    }
}
