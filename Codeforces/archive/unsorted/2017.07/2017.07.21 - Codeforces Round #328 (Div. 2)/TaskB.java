package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        out.print((n - 2) * (n - 2));
    }
}
