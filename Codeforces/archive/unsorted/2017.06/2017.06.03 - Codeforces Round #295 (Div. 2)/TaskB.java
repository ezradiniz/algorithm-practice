package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        if (n > m) {
            out.print(n - m);
            return;
        }

        int middle = m / 2;
        if (n > middle) {
            out.print(n - middle + 1);
            return;
        }

        int res = 0;
        while (n < m) {
            if (m % 2 != 0) {
                ++m;
                ++res;
            }
            m >>= 1;
            ++res;
        }
        out.print(res + (n - m));
    }
}
