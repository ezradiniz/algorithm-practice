package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long k = in.nextLong();

        long m = (long)Math.ceil(n/2.0);
        long res;
        if (k > m) {
            res = 2*(k-m);
        } else {
            res = 2*k-1;
        }

        out.println(res);
    }
}
