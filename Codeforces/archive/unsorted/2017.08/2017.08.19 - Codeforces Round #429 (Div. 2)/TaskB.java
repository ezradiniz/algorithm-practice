package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.math.BigInteger;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextLong();
            sum += a[i];
        }
        if ((sum & 1) == 1) {
            out.print("First");
            return;
        }

        long diff = 0;
        int x = n - 1;
        int y = 0;
        while (x >= y) {
            sum -= a[x];
            diff += a[x];
            if ((sum & 1) == 1) {
                if ((diff & 1) != 0) {
                    out.print("First");
                    return;
                }
                x = n - 1;
                y = x + 1;
                continue;
            }
            --x;
        }
        if (sum == 0 || ((sum & 1) == 0)) {
            out.print("Second");
            return;
        }

        out.print("First");
    }
}
