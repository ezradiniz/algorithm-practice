package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int res = 0;
        int[] a = new int[7];
        for (int i = 0; i < 7; ++i) a[i] = in.nextInt();
        for (int day = 0; ; ++day) {
            if (res >= n) {
                int ans = day % 7;
                out.print((ans == 0) ? 7 : ans);
                return;
            }
            res += a[day % 7];
        }
    }
}
