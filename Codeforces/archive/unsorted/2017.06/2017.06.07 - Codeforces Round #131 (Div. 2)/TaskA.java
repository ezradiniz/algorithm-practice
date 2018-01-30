package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int res = 0;
        for (int i = 0; i * i <= n && i <= m; ++i) {
            int d = n - i * i;
            if (i + d * d == m) ++res;
        }
        out.print(res);
    }
}
