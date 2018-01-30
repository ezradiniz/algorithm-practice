package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long a = in.nextLong();
        long b = in.nextLong();
        long s = in.nextLong();
        long res = Math.abs(a) + Math.abs(b);

        if (s < res || (res - s) % 2 != 0) {
            out.print("No");
        } else {
            out.print("Yes");
        }
    }
}
