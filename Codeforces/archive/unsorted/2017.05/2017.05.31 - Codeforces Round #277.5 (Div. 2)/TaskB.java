package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; ++i) {
            b[i] = in.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int res = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (Math.abs(a[i] - b[j]) <= 1) {
                    res++;
                    b[j] = (int)1e4;
                    break;
                }
            }
        }
        out.print(res);
    }
}
