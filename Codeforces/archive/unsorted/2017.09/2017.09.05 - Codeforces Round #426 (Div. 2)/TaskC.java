package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        for (int i = 0; i < n; ++i) {
            long a = in.nextLong();
            long b = in.nextLong();
            long r = (long) Math.cbrt(a * b);
            long x = a / r;
            long y = b / r;
            if (x * x * y == a && x * y * y == b) out.println("Yes");
            else out.println("No");
        }
    }
}
