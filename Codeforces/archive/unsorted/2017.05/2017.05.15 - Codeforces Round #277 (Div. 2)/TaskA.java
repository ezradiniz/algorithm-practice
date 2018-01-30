package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n  = in.nextLong();
        long res = 0;

        res = (long)Math.ceil(n/2.0);
        if (n % 2 != 0) res *= -1;
        out.println(res);
    }
}
