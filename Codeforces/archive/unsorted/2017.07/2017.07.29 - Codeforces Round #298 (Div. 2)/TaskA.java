package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        if (n > 4) {
            out.println(n);
            for (int i = 1; i <= n; ++i) {
                if (i % 2 == 1) out.print(i + " ");
            }
            for (int i = 1; i <= n; ++i) {
                if (i % 2 == 0) out.print(i + " ");
            }

        } else {
            if (n == 1 || n == 2) {
                out.println("1");
                out.print("1");
            } else if (n == 3) {
                out.println("2");
                out.print("1 3");
            } else if (n == 4) {
                out.println("4");
                out.print("3 1 4 2");
            }
        }
    }
}
