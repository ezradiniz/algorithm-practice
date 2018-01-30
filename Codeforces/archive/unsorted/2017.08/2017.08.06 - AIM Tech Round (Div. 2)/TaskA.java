package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int d = in.nextInt();
        int L = in.nextInt();
        int v1 = in.nextInt();
        int v2 = in.nextInt();

        out.print(String.format("%.19f", (double) (L - d) / (v1 + v2)));
    }
}
