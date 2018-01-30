package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();

        for (long i = 2; i * i <= n; ++i) {
            while (n % (i * i) == 0 && n > 0) {
                n /= i;
            }
        }

        out.print(n);
    }
}
