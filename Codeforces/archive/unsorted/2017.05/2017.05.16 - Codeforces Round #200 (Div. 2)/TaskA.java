package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int res = 1;
        int prev = in.nextInt();
        for (int i = 1; i < n; ++i) {
            int cur = in.nextInt();
            if (cur != prev) res++;
            prev = cur;
        }
        out.println(res);
    }
}
