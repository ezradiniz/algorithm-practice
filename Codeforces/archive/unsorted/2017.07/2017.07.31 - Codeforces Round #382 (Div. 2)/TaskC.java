package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong() - 1;
        long[] dp = new long[100];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= 95; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        for (int i = 1; i <= 95; ++i) {
            dp[i] = dp[i - 1] + dp[i];
        }
        for (int i = 1; i <= 95; ++i) {
            if (dp[i] >= n) {
                out.print(i);
                return;
            }
        }
    }
}
