package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    final static int TIME = 240;

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        int time = 0;
        int res = 0;
        for (int i = 1; i <= n;  ++i) {
            time += 5 * i;
            if (time > TIME - k) break;
            res++;
        }
        out.print(res);
    }
}
