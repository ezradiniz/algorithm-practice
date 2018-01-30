package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = in.nextInt();
        if (n % 2 == 0) {
            out.print("No");
            return;
        }
        if (a[0] % 2 != 0 && a[n - 1] % 2 != 0) {
            int count = 0;
            for (int i = 0; i < n; ++i) {
                if (a[i] % 2 == 0) {
                    ++i;
                } else {
                    ++count;
                }
            }
            if (count % 2 == 0) {
                out.print("No");
            } else {
                out.print("Yes");
            }
        } else {
            out.print("No");
        }
    }
}
