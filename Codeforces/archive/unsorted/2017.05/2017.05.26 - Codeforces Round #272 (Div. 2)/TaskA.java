package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int min = (int)Math.ceil(n/2.0);

        for (int i = min; i <= n; ++i) {
            if (i % m == 0) {
                out.print(i);
                return;
            }
        }

        out.print(-1);
    }
}
