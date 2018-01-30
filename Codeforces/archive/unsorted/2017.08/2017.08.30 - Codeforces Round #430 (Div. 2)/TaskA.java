package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int l = in.nextInt();
        int r = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int k = in.nextInt();

        boolean ok = false;
        for (int i = x; i <= y; ++i) {
            if (l <= i * k && i * k <= r) {
                ok = true;
            }
        }
        if (ok) out.print("YES");
        else out.print("NO");
    }
}
