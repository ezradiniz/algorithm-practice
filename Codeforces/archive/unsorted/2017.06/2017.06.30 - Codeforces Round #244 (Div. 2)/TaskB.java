package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int t = in.nextInt();
        int c = in.nextInt();

        int res = 0;
        int ok = 0;
        for (int i = 0; i < n; ++i) {
            int x = in.nextInt();
            if (x <= t) ++ok;
            else ok = 0;

            if (ok == c) {
                ++res;
                --ok;
            }
        }
        out.print(res);
    }
}
