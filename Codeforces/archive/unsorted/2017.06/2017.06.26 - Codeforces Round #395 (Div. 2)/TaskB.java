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

        for (int i = 0; i < n / 2; ++i) {
            if (i % 2 == 1) continue;
            int tmp = a[i];
            a[i] = a[n - i - 1] ;
            a[n - i - 1] = tmp;
        }

        for (int i = 0; i < n; ++i) out.print(a[i] + " ");
    }
}
