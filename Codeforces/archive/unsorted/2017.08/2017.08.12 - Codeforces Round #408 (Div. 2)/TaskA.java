package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt() - 1;
        int z = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < m; ++i) {
            if (a[i] == 0) continue;
            if (a[i] <= z) {
                l = i;
            }
        }
        int r = Integer.MAX_VALUE;
        for (int i = n - 1; i > m; --i) {
            if (a[i] == 0) continue;
            if (a[i] <= z) {
                r = i;
            }
        }
        if (l < 0) out.print((r - m) * 10);
        else if ( r > n) out.print((m - l) * 10);
        else out.print(Math.min(m - l, r - m) * 10);
    }
}
