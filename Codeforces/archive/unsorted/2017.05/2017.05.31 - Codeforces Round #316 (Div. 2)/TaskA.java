package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < m; ++i) {
            int[] a = new int[n];
            int max = 0;
            for (int j = 0; j < n; ++j) {
                a[j] = in.nextInt();
                max = Math.max(max, a[j]);
            }
            for (int j = 0; j < n; ++j) {
                if (a[j] == max) {
                    c[j] += 1;
                    break;
                }
            }
        }

        int res = 0;
        int max = 0;
        for (int i = 0; i < n; ++i) {
            if (c[i] > max) {
                res = i;
                max = c[i];
            }
        }
        out.print(res + 1);
    }
}
