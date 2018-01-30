package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; ++i) {
            h[i] = in.nextLong();
        }

        long maxH = 0;
        int pmaxH = n - 1;
        long[] row = new long[n];
        for (int i = n - 1; i >= 0; --i) {
            if (h[i] > maxH) {
                maxH = h[i];
                pmaxH = i;
            }
            row[i] = Math.max(0, maxH - h[i] + 1);
            if (pmaxH == i) --row[i];
        }

        for (int i = 0; i < n; ++i) {
            out.print(row[i] + " ");
        }
    }
}
