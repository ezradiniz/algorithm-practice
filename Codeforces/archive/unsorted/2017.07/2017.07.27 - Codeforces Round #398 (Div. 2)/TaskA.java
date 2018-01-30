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

        boolean[] found = new boolean[n + 1];
        int res = n;
        int i = 0;
        while (i < n) {
            int it = a[i];
            found[it] = true;
            if (found[res]) {
                out.print(res + " ");
                --res;
                --i;
            } else {
                out.println();
            }
            i++;
        }

        for (int v = res; v > 0; --v) {
            out.print(v + " ");
        }
    }
}
