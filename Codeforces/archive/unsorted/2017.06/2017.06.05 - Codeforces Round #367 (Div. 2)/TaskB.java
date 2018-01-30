package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; ++i) {
            x[i] = in.nextInt();
        }
        Arrays.sort(x);
        int q = in.nextInt();
        for (int i = 0; i < q; ++i) {
            long m = in.nextInt();
            int res = bsearch(x, m);
            out.println(res + 1);
        }
    }

    private int bsearch(int[] a, long k) {
        int i = 0;
        int j = a.length - 1;

        while (i <= j) {
            int m = (i + j) >> 1;
            if (a[m] <= k) {
                i = m + 1;
            }else {
                j = m - 1;
            }
        }

        return j;
    }
}
