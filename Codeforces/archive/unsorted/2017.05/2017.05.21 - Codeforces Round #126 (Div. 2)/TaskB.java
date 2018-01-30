package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        double res = 0;
        for (int i = 0; i < n; ++i) {
            int p = in.nextInt();
            res += 1.0/(100.0/p);
        }

        res = 100 * res / n;

        out.print(String.format("%.12f", res));
    }
}
