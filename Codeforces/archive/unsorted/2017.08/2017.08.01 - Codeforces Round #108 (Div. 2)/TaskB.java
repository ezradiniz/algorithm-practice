package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        long xc = in.nextInt();
        long yc = in.nextInt();
        int k = in.nextInt();

        long res = 0;
        for (int i = 0; i < k; ++i) {
            int dx = in .nextInt();
            int dy = in.nextInt();

            long offset = 0;

            if (dx > 0) {
                offset = (n - xc) / dx;
            } else if (dx < 0) {
                offset = Math.abs((xc - 1) / dx);
            }

            if (dy > 0) {
                offset = Math.min((offset == 0 ) ? Integer.MAX_VALUE : offset, (m - yc) / dy);
            } else if (dy < 0) {
                offset = Math.min((offset == 0 ) ? Integer.MAX_VALUE : offset, Math.abs((1 - yc) / dy));
            }

            long x = xc + dx * offset;
            long y = yc + dy * offset;

            if (x >= 1 && x <= n && y >= 1 && y <= m) {
                xc = x;
                yc = y;
                res += offset;
            }
        }
        out.print(res);
    }
}
