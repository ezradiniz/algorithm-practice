package solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[][] a = new int[n][2];
        a[0][0] = in.nextInt();
        a[0][1] = 1;
        for (int i = 1; i < n; ++i) {
            a[i][0] = in.nextInt() + a[i-1][0];
            a[i][1] = i + 1;
        }

        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0] - t1[0];
            }
        });

        int m = in.nextInt();

        for (int i = 0; i < m; ++i) {
            int q = in.nextInt();
            int res = search(a, q);
            out.println(res);
        }
    }

    private int search(int[][] a, int q) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            int m = (i + j) >> 1;
            if (a[m][0] == q) return a[m][1];
            if (q < a[m][0]) j = m - 1;
            else i = m + 1;
        }
        return a[i][1];
    }
}
