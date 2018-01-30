package solutions;

import java.util.*;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long[] b = new long[n];
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            b[i] = in.nextLong();
            max = Math.max(max, b[i]);
            min = Math.min(min, b[i]);
        }

        long diff = max - min;
        if (diff == 0) {
            out.print(diff + " " + n * (n - 1) / 2);
        } else {
            long x = 0;
            long y = 0;
            for (int i = 0; i < n; ++i) {
                if (b[i] == max) ++x;
                if (b[i] == min) ++y;
            }

            out.print(diff + " " + (x * y));
        }
    }
}
