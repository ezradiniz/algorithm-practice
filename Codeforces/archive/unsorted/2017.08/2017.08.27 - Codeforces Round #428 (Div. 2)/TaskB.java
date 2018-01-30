package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt(); //rows
        int k = in.nextInt(); //soldiers
        int[] a = new int[k];
        for (int i = 0; i < k; ++i) {
            a[i] = in.nextInt();
        }

        int rows = 0;
        int seats = 0;

        for (int i = 0; i < k; ++i) {
            rows += a[i] / 8;
            int diff = a[i] % 8;

            seats += diff;
        }

        if (rows + Math.ceil(seats / 8.0) <= n) {
            out.print("YES");
        } else {
            out.print("NO");
        }

    }
}
