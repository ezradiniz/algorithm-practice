package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        int t = in.nextInt();
        int d = in.nextInt();

        int res = 0;

        for (int i = 0; i < t; ++i) {
            res += Math.min(v1 + d * i, v2 + d * (t - i -1));
        }

        out.print(res);
    }
}
