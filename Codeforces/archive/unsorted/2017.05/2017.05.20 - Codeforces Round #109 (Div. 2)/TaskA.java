package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int max = 0, min = 0;
        int res = 0;
        for (int i = 0; i < n; ++i) {
            int p = in.nextInt();
            if (i == 0) {
                min = max = p;
                continue;
            }

            if (p < min) {
                min = p;
                res++;
            }

            if (p > max) {
                max = p;
                res++;
            }
        }
        out.print(res);
    }
}
