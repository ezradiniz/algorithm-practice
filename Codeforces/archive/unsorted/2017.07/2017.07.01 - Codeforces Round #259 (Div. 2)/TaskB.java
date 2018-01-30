package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        int minP = 0;
        int min = Integer.MAX_VALUE;
        int prev = 0;
        boolean isSorted = true;
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            if (i == 0) prev = a[i];
            else {
                if (a[i] != prev && a[i] < min) {
                    min = a[i];
                    minP = i;
                }
                if (prev > a[i]) isSorted = false;
                prev = a[i];
            }
        }

        if (isSorted) {
            out.print("0");
            return;
        }

        for (int i = minP; i < minP + n - 1; ++i) {
            if (a[i % n] > a[(i + 1) % n]) {
                out.print("-1");
                return;
            }
        }

        out.print(n - minP);
    }
}
