package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long n = in.nextLong();
        long k = in.nextLong();

        if (((n / k) & 1) == 1) out.print("YES");
        else out.print("NO");
    }
}
