package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        String a = in.next();
        String b = in.next();

        long x = Integer.parseInt(a);
        long y = Integer.parseInt(b);

        long u = Integer.parseInt(a.replaceAll("0", ""));
        long v = Integer.parseInt(b.replaceAll("0", ""));
        long s = Integer.parseInt(String.format("%d", x + y).replaceAll("0", ""));

        if (u + v == s) {
            out.print("YES");
        } else {
            out.print("NO");
        }
    }
}
