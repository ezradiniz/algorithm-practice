package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int x = in.nextInt();

        int res = 0;

        for (int i = 1; i <= n; ++i) {
            int mod = x % i;
            if (mod == 0 && x / i <= n) {
                res++;
            }
        }
        out.print(res);
    }
}
