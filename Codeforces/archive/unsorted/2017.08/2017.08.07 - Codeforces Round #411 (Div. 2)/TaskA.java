package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int l = in.nextInt();
        int r = in.nextInt();
        for (int i = l; i <= r; ++i) {
            if (i % 2 == 0) {
                out.print("2");
                return;
            }
        }
        out.print(l);
    }
}
