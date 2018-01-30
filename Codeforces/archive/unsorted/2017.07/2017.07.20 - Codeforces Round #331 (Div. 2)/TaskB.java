package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        long res = 0;
        for (int i = 1; i < n; ++i) {
            if (i == 1) res += Math.abs(a[i - 1]);
            res += Math.abs(a[i] - a[i - 1]);
        }
        out.print(res);
    }
}
