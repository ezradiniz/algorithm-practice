package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int res = 1;
        int prev = in.nextInt() * 60 + in.nextInt();
        int cont = 1;
        for (int i = 1; i < n; ++i) {
            int cur = in.nextInt() * 60 + in.nextInt();
            if (cur - prev < 1) ++cont;
            else cont = 1;
            res = Math.max(res, cont);
            prev = cur;
        }
        out.print(res);
    }
}
