package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] p = new int[3];
        for (int i = 0; i < 3; ++i) p[i] = in.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, (int)-1e10);
        dp[0] = 0;
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j < 3; ++j) {
                int cut = i - p[j];
                if (cut >= 0) {
                    dp[i] = Math.max(dp[i], dp[cut] + 1);
                }
            }
        }
        out.print(dp[n]);
    }
}
