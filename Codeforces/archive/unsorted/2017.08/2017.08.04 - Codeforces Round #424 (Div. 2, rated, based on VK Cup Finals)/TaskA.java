package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        int i = 1;
        for ( ; i < n; ++i) {
            if (a[i] <= a[i - 1]) break;
        }
        for ( ; i < n; ++i) {
            if (a[i] != a[i - 1]) break;
        }
        for ( ; i < n; ++i) {
            if (a[i] >= a[i - 1]) break;
        }

        if (i == n) out.print("YES");
        else out.print("NO");
    }
}
