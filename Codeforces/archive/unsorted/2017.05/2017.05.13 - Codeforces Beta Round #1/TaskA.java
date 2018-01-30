package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long m = in.nextLong();
        long a = in.nextLong();

        double res = Math.ceil((double)n/a) * Math.ceil((double)m/a);
        out.println((long)res);
    }
}
