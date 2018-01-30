package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int res = 0;
        int prevH = -1;
        for (int i = 0; i < n; ++i) {
            int h = in.nextInt();
            if (i == 0) {
                res += h + 1;
            } else {
                res += Math.abs(prevH - h) + 2;
            }

            prevH = h;
        }
        out.print(res);
    }
}
