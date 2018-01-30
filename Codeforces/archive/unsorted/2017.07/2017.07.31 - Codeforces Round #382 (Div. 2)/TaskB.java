package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        double res1 = 0;
        double res2 = 0;
        int x = Math.min(n1, n2);
        int y = Math.max(n1, n2);
        for (int i = n - 1; i >= n - x && i >= 0; --i) res1 += a[i];
        for (int  i = n - x - 1; i >= 0 && i >= n - x - y; --i) res2 += a[i];

        out.print(String.format("%.5f", res1 / x + res2 / y));
    }
}
