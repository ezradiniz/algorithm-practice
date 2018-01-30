package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        int[] dp = new int[n];
        int count = 0;
        int diff = 0;
        for (int i = 0; i < n; ++i) {
            dp[i] = a[i] + diff;
            if (i + 1 < n) {
                diff = Math.max(0, k - (dp[i] + a[i + 1]));
                count += diff;
            }
        }

        out.println(count);
        for (int i = 0; i < n; ++i) out.print(dp[i] + " ");
    }
}
