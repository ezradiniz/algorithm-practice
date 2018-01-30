package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int c = in.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; ++i) w[i] = in.nextInt();
        int res = 1;
        for (int i = n - 1; i > 0; --i) {
            if (w[i] - w[i-1] <= c) res++;
            else break;
        }
        out.print(res);
    }
}
