package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        if ((n & 1) == 1) {
            out.print("0");
            return;
        }
        out.print((n - 2) / 4);
    }
}
