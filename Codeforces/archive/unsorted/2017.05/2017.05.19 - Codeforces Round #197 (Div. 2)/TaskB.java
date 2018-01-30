package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; ++i) a[i] = in.nextInt();
        long res = 0;
        int prev = 1;
        for (int i = 0; i < m; ++i) {
            if (a[i] >= prev) res += a[i] - prev;
            else res += n - (prev - a[i]);
            prev = a[i];
        }
        out.print(res);
    }
}
