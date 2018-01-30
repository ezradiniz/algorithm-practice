package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        int candies = 0;
        int prev = 0;
        for (int i = 0; i < n; ++i) {
            int cur = a[i] + prev;
            int diff = Math.min(cur, 8);
            candies += diff;
            prev = Math.abs(cur - diff);
            if (candies >= k) {
                out.print(i + 1);
                return;
            }
        }

        out.print(-1);
    }
}
