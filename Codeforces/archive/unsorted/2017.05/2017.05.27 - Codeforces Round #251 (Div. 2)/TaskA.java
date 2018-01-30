package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int d = in.nextInt();
        int time = 0;
        for (int i = 0; i < n; ++i) {
            time += in.nextInt();
        }

        time += (n - 1) * 10;

        if (time > d) {
            out.print(-1);
            return;
        }

        out.print((d - time) / 5 + (n - 1) * 10 / 5);
    }
}
