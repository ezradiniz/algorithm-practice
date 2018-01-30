package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long l = in.nextLong();
        long[] a = new long[(int)n];
        for (int i = 0; i < n; ++i) a[i] = in.nextLong();
        Arrays.sort(a);
        double res = 0;

        if (a[0] != 0) res = Math.max(res, a[0] - 0);
        for (int i = 1; i < n; ++i) {
            if (a[i] != a[i-1]) {
                res = Math.max(res, (a[i] - a[i-1])/2.0);
            }
        }
        if (a[(int) n - 1] != l) res = Math.max(res, l - a[(int) n - 1]);

        out.print(String.format("%.10f", res));
    }
}
