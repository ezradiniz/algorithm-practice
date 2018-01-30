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
        int[] res = new int[n];
        res[n - 1] = a[n - 1];

        for (int i = n - 2; i >= 0; --i) {
           res[i] = a[i] + a[i + 1];
        }

        for (int i = 0; i < n; ++i) out.print(res[i] + " ");
    }
}
