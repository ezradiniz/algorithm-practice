package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; ++i) {
            int min = a[i - 1];
            int max = a[i];

            while (max != min) {
                while (max > min) max = max - min;
                while (min > max) min = min - max;
            }
            a[i] = min;
            a[i - 1] = min;
            Arrays.sort(a);
            res = Math.min(res, min * n);
        }


        out.print(res);
    }
}
