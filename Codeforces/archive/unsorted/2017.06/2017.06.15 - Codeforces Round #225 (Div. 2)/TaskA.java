package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        out.println((int)Math.ceil((n * n) / 2.0));
        for (int i = 0; i < n; ++i) {
            int c = i % 2;
            for (int j = 0; j < n; ++j) {
                if (c == 0) out.print("C");
                else out.print(".");
                c ^= 1;
            }
            out.println();
        }
    }
}
