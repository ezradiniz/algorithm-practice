package solutions;

import java.util.*;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long[] freq = new long[100005];
        for (int i = 0; i < n; ++i) {
            freq[in.nextInt()]++;
        }

        long[] dp = new long[100005];
        dp[1] = freq[1];

        for (int i = 2; i <= 100004; ++i) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + freq[i]*i);
        }

        out.print(dp[100004]);
    }
}
