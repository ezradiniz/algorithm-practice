package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int c = in.nextInt();

        int prev = in.nextInt();

        int res = 0;

        for (int i = 1; i < n; ++i) {
           int cur  = in.nextInt();
           int nb = prev - cur - c;
           if (prev > cur && nb > res) {
               res = nb;
           }
            prev = cur;
        }

        out.print(res);
    }
}
