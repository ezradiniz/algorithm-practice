package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        if (n == 1) {
            out.print("I hate it");
            return;
        }

        StringBuilder sb = new StringBuilder("I hate that");
        for (int i = 1; i < n; ++i) {
            if ((i & 1) == 1) {
                sb.append(" I love");
            } else {
                sb.append(" I hate");
            }

            if (i == n-1) sb.append(" it");
            else sb.append(" that");
        }
        out.print(sb.toString());
    }
}
