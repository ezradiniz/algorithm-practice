package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; ++i) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < m-n+1; i++) {
            res = Math.min(res, a[i+n-1] - a[i]);
        }

        out.println(res);
    }
}
