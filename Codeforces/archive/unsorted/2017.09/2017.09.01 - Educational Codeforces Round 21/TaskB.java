package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long n = in.nextLong();
        long k = in.nextLong();

        long[] a = new long[(int) n];

        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        long prev = 0;
        for (int i = 0; i < k; ++i) {
            prev += a[i];
        }

        long res = prev;
        for (int i = 1; i < n - k + 1; ++i) {
            long s = prev - a[i - 1] + a[i - 1 + (int) k];
            prev = s;
            res += s;
        }

        out.print(String.format("%.10f", ((double) res / (n - k + 1))));
    }
}
