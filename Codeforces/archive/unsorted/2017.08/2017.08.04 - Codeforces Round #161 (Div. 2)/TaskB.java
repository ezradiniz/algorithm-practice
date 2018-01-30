package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        if (k > n) {
            out.print("-1");
            return;
        }
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        if (k <  n -1 && a[n - k] == a[n - k - 1]) out.print("-1");
        else out.print("0 " + a[n - k]);
    }
}
