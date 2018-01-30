package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextLong();
        }
        long res = 0;
        for (int i = 0; i < n; ++i) {
            long b = 0;
            while (a[i] != 0) {
                b += a[i] % 2;
                a[i] /= 2;
            }
            res += b * (b - 1)/2;
        }
        out.print(res);
    }
}
