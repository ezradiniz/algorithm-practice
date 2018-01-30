package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskD {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        if (isValid(a)) {
            out.print("YES");
            return;
        }

        for (int i = 0; i < n / 2; ++i) {
            int t = a[i];
            a[i] = a[n - i -1];
            a[n - i -1] = t;
        }

        if (isValid(a)) {
            out.print("YES");
            return;
        }

        out.print("NO");
    }

    private boolean isValid(int[] a) {
        int n = a.length;
        long[] x = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            x[i + 1] = x[i] + a[i];
        }
        long[] y = new long[n + 1];
        for (int i = 0; i <= n; ++i) {
            y[i] = x[i] - (x[n] - x[i]);
            if (y[i] == 0) return true;
        }
        for (int i = 0; i < n; ++i) {
            if (Arrays.binarySearch(y, i +1, n + 1, 2*a[i]) >= 0) return true;
        }
        return false;
    }
}
