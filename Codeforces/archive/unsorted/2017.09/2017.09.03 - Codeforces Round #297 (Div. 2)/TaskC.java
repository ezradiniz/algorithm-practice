package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; ++i) a[i] = in.nextLong();
        Arrays.sort(a);
        long r1 = 0;
        BigInteger res = BigInteger.ZERO;
        boolean ok = true;
        for (int i = n - 1; i > 0; --i) {
            if (ok && Math.abs(a[i] - a[i - 1]) <= 1) {
                r1 = Math.min(a[i], a[i - 1]);
                ok = false;
                --i;
            } else if (Math.abs(a[i] - a[i - 1]) <= 1) {
                ok = true;
                res = res.add(BigInteger.valueOf(r1).multiply(BigInteger.valueOf(Math.min(a[i], a[i - 1]))));
                --i;
            }
        }
        out.print(res.toString());
    }
}
