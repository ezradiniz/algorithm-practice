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

        int x = -1;
        long res = 0;
        for (int i = 0; i < n; ++i) {
             if (a[i] == 1) {
                 if (x == -1) res = 1L;
                 else res *= i - x;

                 x = i;
             }
        }
        out.print(res);
    }
}
