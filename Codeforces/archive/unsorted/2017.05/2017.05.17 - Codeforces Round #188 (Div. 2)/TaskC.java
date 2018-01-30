package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long x = in.nextLong();
        long y = in.nextLong();
        long m = in.nextLong();

        if (x >= m || y >= m) {
            out.print(0);
        } else if (x <= 0 && y <= 0) {
            out.print(-1);
        } else {

            if (x > y) {
                long tmp = x;
                x = y;
                y = tmp;
            }

            long res = 0;

            if (x < 0) {
                res = -x/y;
                res++;
                x += y * res;
            }

            while (y < m) {
                long sum = x + y;
                x = y;
                y = sum;
                res++;
            }
            out.print(res);
        }
    }
}
