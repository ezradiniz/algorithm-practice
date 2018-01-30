package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; ; ++i) {
            if (m - ((i % n) + 1) < 0) break;
            m = m - ((i % n) + 1);
        }
        out.print(m);
    }
}
