package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        boolean[] bolbs = new boolean[m];
        for (int i = 0; i < n; ++i) {
            int t = in.nextInt();
            for (int j = 0; j < t; ++j) {
                bolbs[in.nextInt() - 1] = true;
            }
        }
        for (int i = 0; i < m; ++i) if (!bolbs[i]) {
            out.print("NO");
            return;
        }
        out.print("YES");
    }
}
