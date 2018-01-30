package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int res = 0;
        for (int i = 0; i < n; ++i) {
            int p = in.nextInt();
            int q = in.nextInt();
            if (q - p >= 2) res++;
        }
        out.println(res);
    }
}
