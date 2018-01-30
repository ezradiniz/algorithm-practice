package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int x = in.nextInt();
        if (n == 1) {
            out.print("YES\n" + x);
        } else if (n == 2 && x == 0) {
            out.print("NO");
        } else if (n == 2) {
            out.print("YES\n0 " + x);
        } else {
            int res = 0;
            out.print("YES\n");
            for (int i = 1; i <= n - 3; ++i) {
                out.print(i + " ");
                res ^= i;
            }

            final long pw1 = (1L << 17);
            final long pw2 = (1L << 18);

            if (res == x) out.print((pw1 + pw2) + " " + pw1 + " " + pw2);
            else out.print(pw1 + " " + ((pw1 ^ x) ^ res) + " 0");
        }
    }
}
