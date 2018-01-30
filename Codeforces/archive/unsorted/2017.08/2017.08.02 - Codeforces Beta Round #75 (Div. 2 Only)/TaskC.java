package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskC {

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        char[] s1 = in.next().toCharArray();
        char[] s2 = in.next().toCharArray();

        int n1 = s1.length;
        int n2 = s2.length;

        int[][] dp = new int[n1 + 1][256];
        Arrays.fill(dp[n1], n1);

        for (int i = n1 - 1; i >= 0; --i) {
            Arrays.fill(dp[i], n1);
            for (char j = 'a'; j <= 'z'; ++j) {
                if (s1[i] == j) dp[i][j] = i;
                else if (i + 1 < n1) dp[i][j] = dp[i + 1][j];
            }
        }

        int res = 1;
        int pos = 0;

        for (int i = 0; i < n2; ++i) {
            pos = dp[pos][s2[i]];
            if (pos == n1) {
                if (dp[0][s2[i]] == n1) {
                    out.print("-1");
                    return;
                }
                pos = dp[0][s2[i]];
                ++res;
            }
            ++pos;
        }

        out.print(res);
    }
}
