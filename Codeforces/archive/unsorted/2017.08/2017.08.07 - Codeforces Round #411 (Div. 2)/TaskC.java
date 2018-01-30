package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        out.print((n - 2) / 2 + ((n % 2 == 1 && n > 1) ? 1 : 0));
    }
}
