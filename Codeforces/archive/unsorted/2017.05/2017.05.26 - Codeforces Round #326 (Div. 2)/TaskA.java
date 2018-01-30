package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt();
            int p = in.nextInt();
            if (p < min) {
                min = p;
            }
            res += a * min;
        }
        out.print(res);
    }
}
