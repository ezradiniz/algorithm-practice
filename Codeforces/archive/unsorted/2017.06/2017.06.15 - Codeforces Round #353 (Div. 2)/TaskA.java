package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        if (c == 0) {
            if (a == b) out.println("YES");
            else out.println("NO");
        } else {
            if ((b - a)  % c == 0 && (b - a) / c >= 0) out.println("YES");
            else out.println("NO");
        }
    }
}
