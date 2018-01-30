package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long x1 = in.nextInt();
        long y1 = in.nextInt();
        long x2 = in.nextInt();
        long y2 = in.nextInt();

        long x = Math.abs(x2 - x1);
        long y = Math.abs(y2 - y1);

        out.print(Math.min(x, y) + (Math.max(x, y) - Math.min(x, y)));
    }
}
