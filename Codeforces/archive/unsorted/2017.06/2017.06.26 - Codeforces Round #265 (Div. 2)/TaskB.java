package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] p = new int[n];
        int j = 0;
        for (int i = 0; i < n; ++i) {
            int v = in.nextInt();
            if (v == 1) {
                p[j++] = i;
            }
        }

        int res = 0;
        int prev = p[0];
        if (j > 0) ++res;
        for (int i = 1; i < j; ++i) {
            int cur = p[i];
            if (cur - prev > 1) ++res;
            ++res;
            prev = cur;
        }
        out.print(res);
    }
}
