package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        int res = Integer.MAX_VALUE;
        // naive solution
        for (int i = 1; i < n - 1; ++i) {
            int maxDiff = 0;
            int x = 0;
            int y = 0;
            for (int j = 1; j < n; ++j) {
                if (j == i) x = 1;
                else x = 0;

                if (j - 1 == i) y = 1;
                else y = 0;

                maxDiff = Math.max(maxDiff, a[j + x] - a[j - 1 - y]);
            }
            res = Math.min(res, maxDiff);
        }
        out.print(res);
    }
}
