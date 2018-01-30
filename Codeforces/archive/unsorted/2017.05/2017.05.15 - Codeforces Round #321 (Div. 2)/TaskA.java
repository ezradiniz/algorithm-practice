package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = in.nextInt();
        int res = 0;
        int count = 1;
        int prev = a[0];
        for (int i = 1; i < n; ++i) {
            int cur = a[i];
            if (cur >= prev) count++;
            else {
                res = Math.max(res, count);
                count = 1;
            }
            prev = cur;
        }

        res = Math.max(res, count);

        out.println(res);
    }
}
