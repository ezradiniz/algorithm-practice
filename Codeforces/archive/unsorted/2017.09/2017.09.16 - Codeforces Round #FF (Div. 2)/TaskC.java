package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        Arrays.fill(dp1, 1);
        Arrays.fill(dp2, 1);

        for (int i = 0; i < n; ++i) a[i] = in.nextInt();

        for (int i = 1; i < n; ++i) if (a[i - 1] < a[i]) {
            dp1[i] += dp1[i - 1];
        }

        for (int i = n - 2; i >= 0; --i) if (a[i] < a[i + 1]) {
            dp2[i] += dp2[i + 1];
        }

        int res = 1;

        for (int i = 0; i < n; ++i) {
            if (i > 0 && i < n - 1 && a[i - 1] + 1 < a[i + 1]) res = Math.max(res, dp1[i - 1] + dp2[i + 1] + 1);
            else {
                if (i > 0 ) res = Math.max(res, dp1[i - 1] + 1);
                if (i < n - 1) res = Math.max(res, dp2[i + 1] + 1);
            }
        }
        
        out.print(res);
    }
}
